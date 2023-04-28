import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] _world;
    static Point Starting_Position = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void loadTiles() {

        List<String> rows = new ArrayList<String>();
        try {
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt")); // Buffer Class
            String row;
            while ((row = f.readLine()) != null) {                                       // f - Object
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;   // finding number of cols // split find the character
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for (int y = 0; y < rows.size(); y++) {
                cols = rows.get(y).split("\t");
                for (int x = 0; x < cols.length; x++) {           // Counter control loop
                    tile_name = cols[x];
                    if (tile_name.equals("StartingArea")) {
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ") ? null : tile_name;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MapTile tile_exists(int x, int y) {
        MapTile mt = null;

        //Todo : verify the x and y exist in the world
        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length)
                && _world[x][y] != null) {
            switch (_world[x][y]) {
                case "StartingArea":
                    mt = new StartingArea(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "CrocodileTerritory":

                    mt = new CrocodileTerritory(x, y, new Crocodile());
                    mt = checkRoomExists(mt);
                    break;
                case "DevilReefCarbTerritory":
                    mt = new DevilReefCarbTerritory(x, y, new DevilReefCrab());
                    mt = checkRoomExists(mt);
                    break;
                case "ScorpionsTerritory":
                    mt = new ScorpionsTerritory(x, y, new Scorpions());
                    mt = checkRoomExists(mt);
                    break;
                case "SnakeTerritory":
                    mt = new SnakeTerritory(x, y, new Snake());
                    mt = checkRoomExists(mt);
                    break;
                case "WidowSpiderTerritory":
                    mt = new WidowSpiderTerritory(x, y, new WidowSpider());
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureBox":
                    mt = new TreasureBox(x, y, new Gold(15));
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyBox":
                    mt = new EmptyBox(x, y);
                    break;
                case "FoodBox":
                    mt = new FoodBox(x, y, new Food("Apple", 50));
                    mt = checkRoomExists(mt);
                    break;
                case "KnifeBox":
                    mt = new KnifeBox(x, y, new Knife());
                    mt = checkRoomExists(mt);
                    break;
                case "ShovelBox":
                    mt = new ShovelBox(x, y, new Shovel());
                    mt = checkRoomExists(mt);
                    break;
                case "SwordBox":
                    mt = new SwordBox(x, y, new Sword());
                    mt = checkRoomExists(mt);
                    break;
                case "HammerBox":
                    mt = new HammerBox(x, y, new Hammer());
                    mt = checkRoomExists(mt);
                    break;
                case "FindShipWrack":
                    mt = new FindShipWrack(x, y);
                    break;
            }
        }
        return mt;

    }

    private static MapTile checkRoomExists(MapTile mt) {
        if (history.indexOf(mt) != -1) {
            mt = history.get(history.indexOf(mt));
        } else {
            history.add(mt);
        }
        return mt;
    }
}

