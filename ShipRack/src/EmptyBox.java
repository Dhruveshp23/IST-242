public class EmptyBox extends MapTile {

    private String desc;
    private boolean noitem;

    public EmptyBox(int x, int y) {
        super(x, y);
        desc = "Empty room with creaking floorboards, rusty walls and feels presence of natural entities";
    }
    public String intro_text(){
        return desc;
    }
    public void modify_player(Player player){

    }


}
