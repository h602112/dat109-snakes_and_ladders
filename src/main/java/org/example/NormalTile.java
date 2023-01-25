package org.example;

public class NormalTile extends Tile {
    private int index;

    public NormalTile(int index) {
        this.index = index;
    }
    @Override
    public void landedOn() {
        System.out.println("landed on a normal tile");
    }
    @Override
    public int getIndex() {
        return index;
    }
    @Override
    public void setIndex(int index) {
        this.index = index;
    }
}
