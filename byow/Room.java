package byow;

import byow.TileEngine.TETile;
import byow.TileEngine.Tileset;
import java.util.ArrayList;

public class Room {

    public static ArrayList<Room> rooms;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int w;
    private int h;
    private int centerX;
    private int centerY;

    public Room(int x, int y, int w, int h) {
        this.w = w;
        this.h = h;
        this.x1 = x;
        this.x2 = x + w;
        this.y1 = y;
        this.y2 = y + h;
        this.centerX = (int) (x1 + x2) / 2;
        this.centerY = (int) (y1 + y2) / 2;
    }

    public Room() {
        rooms = new ArrayList<>();
    }

    /**
     * Getter
     **/

    public int getW() {
        return this.w;
    }

    public int getH() {
        return this.h;
    }

    public int getX1() {
        return this.x1;
    }

    public int getY1() {
        return this.y1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY2() {
        return this.y2;
    }

    public int getCenterX() {
        return this.centerX;
    }

    public int getCenterY() {
        return this.centerY;
    }

    public static ArrayList getRooms() {
        return rooms;
    }

    /**
     * Setter
     **/

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x1 = x2;
    }

    public void setY1(int y1) {
        this.x1 = y1;
    }

    public void setY2(int y2) {
        this.x1 = y2;
    }


    public void putRoom(TETile[][] world, Room room) {
        int x01 = room.getX1();
        int x02 = room.getX2();
        int y01 = room.getY1();
        int y02 = room.getY2();
        for (int x = x01; x <= x02; x++) {
            for (int y = y01; y <= y02; y++) {
                if (x == x01 || x == x02 || y == y01 || y == y02) {
                    world[x][y] = Tileset.WALL;
                } else {
                    world[x][y] = Tileset.FLOOR;
                }
            }
        }
        rooms.add(room);
    }
}
