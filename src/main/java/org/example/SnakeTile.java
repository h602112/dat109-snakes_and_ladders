package org.example;

public class SnakeTile extends Tile{
    private int index;
    private int end;

    public SnakeTile(int index, int end) {
        this.index = index;
        this.end = end;
    }

    @Override
    public void landedOn() {
        System.out.println("landed on a snake tile");
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int getIndex() {
        return index;
    }
}
