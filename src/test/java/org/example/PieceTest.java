package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {

    @Test
    public void testMove() {
        Board board = new Board();
        board.createTiles();
        Piece piece = new Piece(board.getTile(0), board);
        piece.move(1);
        assertEquals(1, piece.getTile().getIndex());
    }

}