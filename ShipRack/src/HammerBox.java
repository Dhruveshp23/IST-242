public class HammerBox extends LootBox{
    public HammerBox(int x, int y, Hammer hammer){
        super(x, y, hammer);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice you got Hammer for kill Enemy.");
        else
            return "";
    }
}
