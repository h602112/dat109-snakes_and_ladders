package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    public void testFindTile() {
        Board board = new Board();
        board.createTiles();
        Tile tile = board.findTile(board.getTile(0), 5);
        assertEquals(5, tile.getIndex());
    }
}