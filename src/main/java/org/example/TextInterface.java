package org.example;

import java.util.Scanner;

public class TextInterface {

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        board.createTiles();
        Dice dice = new Dice();
        //asks for the number of players using the terminal
        System.out.println("how many players are playing?: ");
        int numberOfPlayers = scanner.nextInt();

        //creates a list of players using the inputted number of players
        Player[] players = new Player[numberOfPlayers];
        /**
         * for loop that asks for the name of each player and creates a player object
         * with the name and a piece object with the board and the first tile.
         * tried using a factory class for this at first, but encountered problems with the
         * implementation.
         */
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter name of player " + (i + 1) + ": ");
            String name = scanner.next();
            players[i] = new Player(name, new Piece(board.getTile(0), board));
        }
        boolean gameIsRunning = true;

        /** while loop that runs the game until a player reaches the last tile
         * if a player is close to last tile but rolls a number that would put them
         * over the last tile, they will not move.
         */
        while (gameIsRunning) {
            for (Player player: players) {
                player.playTurn(dice);
                if (player.getPiece().getTile().getIndex() == 99) {
                    System.out.println(player.getName() + " won!");
                    gameIsRunning = false;
                    break;
                }
                System.out.print(player.getName() +
                        " is on tile " + player.getPiece().getTile().getIndex() + " and ");
                player.getPiece().getTile().landedOn();
            }
        }
    }
}
