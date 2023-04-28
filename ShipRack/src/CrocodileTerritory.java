public class CrocodileTerritory extends EnemyTerritory{
    Crocodile enemy;
    public CrocodileTerritory(int x, int y, Crocodile enemy){
        super(x, y,enemy);
        this.enemy = enemy;

    }
    public String intro_text(){
        if (enemy.is_alive()){
            return "A  Crocodile comes out, the whole ground shivers at its movement as it approaches you!!!";
        }else{
            return "The corpse of a dead Crocodile rots on the ground.";
        }

    }
}
