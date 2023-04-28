public class WidowSpiderTerritory extends EnemyTerritory{
    WidowSpider enemy;
    public WidowSpiderTerritory (int x, int y, WidowSpider enemy){
        super(x, y,enemy);
        this.enemy=enemy;

    }
    public String intro_text(){
        if (enemy.is_alive()){
            return "A Widow Spider comes out, the whole ground shivers at its movement as it approaches you!!!";
        }else{
            return "The corpse of a dead Widow Spider rots on the ground.";
        }
    }
}
