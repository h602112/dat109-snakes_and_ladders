package org.example;

public class Board {
    private Tile[] tiles;

    public Board() {
        tiles = new Tile[100];
    }

    public Tile getTile(int index) {
        return tiles[index];
    }


    public Tile findTile(Tile tile, int sum) {
        return tiles[tile.getIndex() + sum];
    }

    public void addTile(Tile tile, int index) {
        tiles[index] = tile;
    }

    public void createTiles() {
        for (int i = 0; i < tiles.length; i++) {
            addTile(new NormalTile(i), i);
        }
    }
}
