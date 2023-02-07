package org.example;

public class Board {

    private LadderTile[] ladderTiles;
    private SnakeTile[] snakeTiles;

    public Board(LadderTile[] ladderTiles, SnakeTile[] snakeTiles) {

        this.ladderTiles = ladderTiles;
        this.snakeTiles = snakeTiles;
    }

    public SnakeTile[] getSnakeTiles() {
        return snakeTiles;
    }

    public LadderTile[] getLadderTiles() {
        return ladderTiles;
    }
}
