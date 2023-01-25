package org.example;

public class Player {
    private Piece piece;
    private String name;

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void move(int sum) {
        piece.move(sum);
    }

    public void playTurn(Dice dice) {
        dice.roll();
        move(dice.getFaceValue());
    }
}
