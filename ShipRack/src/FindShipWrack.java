public class FindShipWrack extends MapTile{
    private String desc;

    public FindShipWrack(int x, int y) {
        super(x, y);
        desc = "You have safely made it out of 'Gaint Cave' with all Loots";
    }
    public String intro_text(){
        return "\n You see a bright Light in the distance";
    }
    public void modify_player(Player player){
        player.victory = true;

    }
}
