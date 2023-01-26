public class Weapon extends Item{
    private int damage;
    public int getDamage(){
        return damage;
    }
    public void setDamage(){
        this.damage = damage;
    }
    public Weapon(String name, String desc, int value, int damage){
        super(name,desc,value);
        this.damage = damage;
    }


    public String Str(){
        return String.format("{0}\n=====\n{1}\nvalue: {2}\nDamge: {3}", this.name, this.desc, this.value, this.damage);
    }
}
