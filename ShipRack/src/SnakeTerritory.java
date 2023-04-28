public class SnakeTerritory extends EnemyTerritory{
    Snake enemy;
    public SnakeTerritory (int x, int y, Snake enemy){
        super(x, y,enemy);
        this.enemy=enemy;

    }
    public String intro_text(){
        if (enemy.is_alive()){
            return "A Snake comes out, the whole ground shivers at its movement as it approaches you!!!";
        }else{
            return "The corpse of a dead Snake rots on the ground.";
        }
    }
}
