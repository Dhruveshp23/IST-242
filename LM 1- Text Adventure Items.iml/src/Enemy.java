public class Enemy {
   String name;
    protected int hp;
    protected int damage;


    public boolean is_alive(){
        return (this.hp > 0);
    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \n", this.name, this.hp, this.damage);
    }
}