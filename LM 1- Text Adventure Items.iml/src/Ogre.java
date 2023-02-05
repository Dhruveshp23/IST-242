public class Ogre extends Enemy{
    String name;
    protected int hp;
    protected int damage;
    protected String strength;
    protected String size;

    public Ogre(String name, int hp, int damage, String strength, String size){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.strength = strength;
        this.size = size;

    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nStrength = %s \nSize = %s \n", this.name, this.hp, this.damage,
                this.strength, this.size);
    }


}
