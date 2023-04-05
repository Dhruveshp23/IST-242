import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Player implements Comparable<Player>{

    int hp;

    String name;
    public int compareTo (Player othrPlyr) { return othrPlyr.score.compareTo(this.score); }
    public String getName () { return name; }

    public void setName (String name) { this.name = name; }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }


    int plyrGold;
    Integer score;
    Boolean victory;
    int location_x, location_y;
    int prevLocatnX, prevLocatnY;
    ArrayList<Item> inventory = new ArrayList<>();



    public Player(String name){
        super();
        this.name= name;
        inventory.add(new Gold(20));
        inventory.add(new Pillow());
        this.hp = 200;
        this.location_x = World.startingPosition.x;
        this.location_y = World.startingPosition.y;
        this.victory = false;
    }

    public Player() {
        // TODO Auto-generated constructor stub
    }
    public boolean is_alive(){return (hp > 0);}


    public void print_inventory(){
        int totalGold=0;Gold geld=null ;
        for (Item item: inventory) {
            if (!(item instanceof Gold))
            {

                System.out.println(item.toString());
            }
            else {
                geld = (Gold) item;
                totalGold += geld.amt;
            }
        }
        Item gold = new Gold(totalGold);
        plyrGold = totalGold;
        System.out.println(gold.toString());
    }

    public void updateGold()
    {
        int totalGold=0;Gold geld=null ;
        for (Item item: inventory){
            if(!(item instanceof Gold))
            {

            }
            else
            {
                geld = (Gold )item;
                totalGold += geld.amt;
            }
        }
        Item gold = new Gold(totalGold);
        plyrGold = totalGold;
    }

    public void writeToFile()
    {
        updateGold();
        try {
            File fw = new File("Scores.txt");
            if(!fw.exists() )
            {
                fw.createNewFile();
            }

            FileWriter fobj= new FileWriter(fw, true);
            PrintWriter pobj = new PrintWriter(fobj);
            pobj.println(name+"\t"+plyrGold);

            pobj.close();
            fobj.close();
            FileReader frdr = new FileReader(fw);
            BufferedReader brdr= new BufferedReader(frdr);
            String entry = "";
            ArrayList<Player> plyrs = new ArrayList<>();
            while((entry=brdr.readLine()) != null)
            {
                String arr[] = entry.split("\t");
                Player plyr = new Player();
                plyr.setName(arr[0]);
                plyr.setScore(Integer.parseInt(arr[1]));
                plyrs.add(plyr);
            }

            Collections.sort(plyrs);
            for(Player p:plyrs)
            {
                System.out.println("Name:"+p.getName()+"     Score:"+p.getScore());

            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void move(int dx, int dy){
        prevLocatnX = location_x;
        prevLocatnY = location_y;
        location_x += dx;
        location_y += dy;
        System.out.print(World.tile_exists(location_x, location_y).intro_text());
    }
    public void move_north() {move(-1,0);}
    public void move_south() {move(1,0);}
    public void move_east() {move(0,1);}
    public void move_west() {move(0,-1);}

    public void doFlee(MapTile mp)
    {
        ArrayList<Action> available_moves = mp.adjacent_moves();
        Random rn=new Random();
        int random=rn.nextInt(available_moves.size());
        Action randomAction=available_moves.get(random);
        do_action(randomAction, null, null);
    }
    public void attackEnemy(Enemy enemy)
    {
        Weapon best_weapon = new Weapon("None","None",0,0);
        int max_dmg = 0;
        for (Item i:inventory){
            if (i instanceof Weapon){
                Weapon wpn = (Weapon)i;
                if (wpn.getDamage() > max_dmg){
                    max_dmg = wpn.getDamage();
                    best_weapon = wpn;
                }
            }
        }
        System.out.printf("You use %s against %s!",best_weapon.name, enemy.name);
        enemy.hp -= best_weapon.getDamage();
        if (!enemy.is_alive()){
            System.out.printf("You killed %s!",enemy.name);
        }else {
            System.out.printf("%s HP is %d.",enemy.name, enemy.hp);

        }
    }
    public void do_action(Action action, Enemy kwargs,MapTile mp){
        if(kwargs == null)
        {
            if(action instanceof MoveEast)
            {
                move_east();
            }else if (action instanceof MoveWest)
            {
                move_west();
            }else if (action instanceof MoveNorth)
            {
                move_north();
            }else if (action instanceof MoveSouth)
            {
                move_south();
            }else if (action instanceof ViewInventory)
            {
                print_inventory();
            }else if(action instanceof Flee)
            {
                doFlee(mp);
            }
        }
        else if (action instanceof Attack)
        {
            attackEnemy(kwargs);
        }
    }
}