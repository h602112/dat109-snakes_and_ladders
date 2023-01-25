package org.example;

public class Piece {
    private Tile tile;
    private Board board;

    public Piece(Tile tile, Board board) {
        this.tile = tile;
        this.board = board;
    }

    public void move(int sum) {
        if (tile.getIndex() + sum > 99) {
            return;
        } else {
            Tile newTile = board.findTile(tile, sum);
            tile = newTile;
            setTile(newTile);
        }
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public Tile getTile() {
        return tile;
    }
}
