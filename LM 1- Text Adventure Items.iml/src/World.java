import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] world;
    static Point startingPosition = new Point(0, 0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void loadTiles() {
        List<String[]> rows = new ArrayList<>();
        try (BufferedReader f = new BufferedReader(new FileReader("src/map.txt"))) {
            String row;
            while ((row = f.readLine()) != null) {
                rows.add(row.split("\t"));
            }
            int xMax = rows.get(0).length;
            world = new String[rows.size()][xMax];
            for (int y = 0; y < rows.size(); y++) {
                String[] cols = rows.get(y);
                for (int x = 0; x < xMax; x++) {
                    String tileName = cols[x];
                    if (tileName.equals("Starting Point")) {
                        startingPosition.x = x;
                        startingPosition.y = y;
                    }
                    world[y][x] = tileName.equals(" ") ? null : tileName;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[][] getWorld() {
        return world;
    }

    public static Point getStartingPosition() {
        return startingPosition;
    }

    public static ArrayList<MapTile> getHistory() {
        return history;
    }

    public static MapTile tile_exists(int x, int y) {
        MapTile mt = null;

        //Todo : verify the x and y exist in the world
        if ((x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length)
                && _world[x][y] != null) {
            switch (_world[x][y]) {
                case "StartingRoom":
                    mt = new StartingRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "FindDaggerRoom":

                    mt = new FindDaggerRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "GiantSpiderRoom":
                    mt = new GiantSpiderRoom(x, y, new GiantSpider());
                    mt = checkRoomExists(mt);
                    break;
                case "TreasureRoom":
                    mt = new TreasureRoom(x, y, new Gold(15));
                    mt = checkRoomExists(mt);
                    break;
                case "EmptyCavePath":
                    mt = new EmptyCavePath(x, y);
                    break;
                case "FindArrowRoom":
                    mt = new FindArrowRoom(x, y);
                    mt = checkRoomExists(mt);
                    break;
                case "OgreRoom":
                    mt = new OgreRoom(x, y, new Ogre());
                    mt = checkRoomExists(mt);
                    break;
                case "LeaveCaveRoom":
                    mt = new LeaveCaveRoom(x, y);
                    break;


            }
        }
        return mt;

    }
}

}