public class Dog extends Enemy{
    private String smellStrength;
    private String teeth;

    public Dog(String name, int hp, int damage, String smellStrength, String teeth){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.smellStrength = smellStrength;
        this.teeth = teeth;

    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nsmellStrength = %s \nTeeth = %s\n", this.name,
                this.hp, this.damage, this.smellStrength,this.teeth);
    }
}