public class Lizards extends Enemy{


    private int poisonLevel;
    private String colourChanging;
    public Lizards(String name, int hp, int damage, int poisonLevel, String colourChanging){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.poisonLevel = poisonLevel;
        this.colourChanging = colourChanging;

    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \npoisonLevel = %d \nColourChanging = %s\n", this.name, this.hp, this.damage,
                this.poisonLevel,this.colourChanging);
    }

}