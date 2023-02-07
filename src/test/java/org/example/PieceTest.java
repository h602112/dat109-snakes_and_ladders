package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    public void testMove() {
        LadderTile[] ladderTiles = TileFactory.createLadderTiles();
        SnakeTile[] snakeTiles = TileFactory.createSnakeTiles();
        Board board = new Board(ladderTiles, snakeTiles);
        Piece piece = new Piece(0, board);
        assertEquals(0, piece.getPosition());
        piece.move(2);
        assertEquals(38, piece.getPosition());

    }

}