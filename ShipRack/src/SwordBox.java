public class SwordBox extends LootBox{
    public SwordBox(int x, int y, Sword sword){
        super(x, y, sword);
    }
    public String intro_text(){
        if(pickedItem == false)
            return String.format("You notice you got a Sword");
        else
            return "";
    }
}
