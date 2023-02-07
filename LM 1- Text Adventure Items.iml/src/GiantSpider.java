public class GiantSpider extends Enemy{

    private String webSize;
    private String colour;

    public GiantSpider(String webSize, String colour){
        super("bigSpider",10,5);
        this.webSize = webSize;
        this.colour = colour;

    }
    public String toString(){
        return String.format("%s \n=====\nHp = %s \nDamage = %d \nWebSize = %s \nColour = %s\n", this.name, this.hp, this.damage,
                this.webSize,this.colour);
    }

}