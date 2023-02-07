public class Ogre extends Enemy{

    private String size;
    private String strength;

    public Ogre(String size, String strength){
        super("Ogre",20,30);
        this.size = size;
        this.strength = strength;
    }

    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nSize = %s\nStrength = %s\n", this.name, this.hp,
                this.damage, this.size, this.strength);
    }

}
