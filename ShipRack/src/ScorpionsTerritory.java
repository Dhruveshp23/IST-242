public class ScorpionsTerritory extends EnemyTerritory{
    Scorpions enemy;
    public ScorpionsTerritory (int x, int y, Scorpions enemy){
        super(x, y,enemy);
        this.enemy=enemy;

    }
    public String intro_text(){
        if (enemy.is_alive()){
            return "A Scorpions comes out, the whole ground shivers at its movement as it approaches you!!!";
        }else{
            return "The corpse of a dead Scorpions rots on the ground.";
        }
    }
}
