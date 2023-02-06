public class Zombie extends Enemy{

    private String speed;
    private String vision;
    public Zombie(String name, int hp, int damage, String speed, String vision){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.vision = vision;
    }


    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nSpeed = %s \nVision = %s\n", this.name, this.hp,
                this.damage, this.speed, this.vision);
    }

}