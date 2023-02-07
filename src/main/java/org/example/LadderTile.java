package org.example;

public class LadderTile extends Tile{
    private int index;
    private int end;

    public LadderTile(int index, int end) {
        this.index = index;
        this.end = end;
    }

    @Override
    public void landedOn() {
        System.out.println("landed on a ladder tile");
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int getIndex() {
        return index;
    }
}

