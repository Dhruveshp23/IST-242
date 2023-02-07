public class Ogre extends Enemy{


    private String strength;
    private String size;

    public Ogre(String strength,String size){
        super("Ogre",20,30);

    }

    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nStrength = %s \nSize = %s \n", this.name, this.hp, this.damage,
                this.strength, this.size);
    }

}
