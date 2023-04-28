public class ShovelBox extends LootBox{
    public ShovelBox (int x, int y, Shovel shovel){
        super(x, y, shovel);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You got one Shovel for killing Enemy");
        else
            return "";
    }
}
