package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalTileTest {

    @Test
    void landedOn() {
        NormalTile normalTile = new NormalTile(0);
        normalTile.landedOn();
    }

    @Test
    public void testGetIndex() {
        NormalTile normalTile = new NormalTile(0);
        assertEquals(0, normalTile.getIndex());
    }


}

