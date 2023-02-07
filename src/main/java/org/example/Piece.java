package org.example;

public class Piece {
    private Board board;
    private int position;

    public Piece(int startingPosition, Board board) {
        this.position = startingPosition;
        this.board = board;
    }

    public void move(int sum) {
        if (position + sum > 99) {
            return;
        }
        for (SnakeTile snakeTile: board.getSnakeTiles()) {
            if (snakeTile.getIndex() == position + sum) {
                snakeTile.landedOn();
                position = snakeTile.getEnd();
                return;
            }
        }
        for (LadderTile ladderTile: board.getLadderTiles()) {
            if (ladderTile.getIndex() == position + sum) {
                ladderTile.landedOn();
                position = ladderTile.getEnd();
                return;
            }
        }
        position += sum;
    }

    public int getPosition() {
        return position;
    }
}
