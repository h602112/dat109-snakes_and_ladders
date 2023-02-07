package org.example;

public class TileFactory {


    public static LadderTile[] createLadderTiles() {
        return new LadderTile[] {new LadderTile(1, 38), new LadderTile(4, 14),
                new LadderTile(8, 30), new LadderTile(21, 42), new LadderTile(28, 76),
                new LadderTile(50, 67), new LadderTile(71, 92), new LadderTile(80, 99)};
    }

    public static SnakeTile[] createSnakeTiles() {
        return new SnakeTile[] {new SnakeTile(36, 6), new SnakeTile(32, 10),
                new SnakeTile(62, 18), new SnakeTile(88, 24), new SnakeTile(95, 56),
                new SnakeTile(97, 78), new SnakeTile(48, 26)};
    }
}
