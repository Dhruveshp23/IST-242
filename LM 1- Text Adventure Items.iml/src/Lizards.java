public class Lizards extends Enemy{


    private int poisonLevel;
    private String colourChanging;
    public Lizards( int poisonLevel, String colourChanging){
        super("poisonLizard",25,30);
        this.poisonLevel = poisonLevel;
        this.colourChanging = colourChanging;

    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \npoisonLevel = %d \nColourChanging = %s\n", this.name, this.hp, this.damage,
                this.poisonLevel,this.colourChanging);
    }

}