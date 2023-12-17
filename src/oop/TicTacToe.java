/*
package oop;

import java.util.Scanner;

class TicTacToe {
    // Enumeration to represent the state of a cell
    enum Cell {
        X, O, EMPTY
    }

    // Enumeration to represent the current state of the game
    enum GameState {
        X_WINS, O_WINS, TIE, IN_PROGRESS
    }

    // The current player
    private Cell currentPlayer = Cell.X;
    // The game board
    private Cell[][] board = new Cell[3][3];
    // The current state of the game
    private GameState gameState = GameState.IN_PROGRESS;

    // Initialize the board with empty cells
    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Cell.EMPTY;
            }
        }
    }

    // Play a move at the specified row and column
    public void play(int row, int col) {
        if (gameState != GameState.IN_PROGRESS) {
            throw new IllegalStateException("Game is not in progress.");
        }
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            throw new IllegalArgumentException("Invalid row or column.");
        }
        if (board[row][col] != Cell.EMPTY) {
            throw new IllegalArgumentException("Cell is already occupied.");
        }
        board[row][col] = currentPlayer;
        if (checkWin(currentPlayer)) {
            gameState = (currentPlayer == Cell.X) ? GameState.X_WINS : GameState.O_WINS;
        } else if (checkTie()) {
            gameState = GameState.TIE;
        }else {
            currentPlayer = (currentPlayer == Cell.X) ? Cell.O : Cell.X;
        }
    }

    // Check if the specified player has won
    private boolean checkWin(Cell player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Cell.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        while (game.getGameState() == GameState.IN_PROGRESS) {
            // Print the game board
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(game.getCell(i, j) + " ");
                }
                System.out.println();
            }

            // Get the next move from the current player
            System.out.print("Player " + game.getCurrentPlayer() + ", enter row: ");
            int row = scanner.nextInt();
            System.out.print("Player " + game.getCurrentPlayer() + ", enter column: ");
            int col = scanner.nextInt();

            // Play the move
            game.play(row, col);
        }

        // Print the game state
        System.out.println("Game over. " + game.getGameState());
    }
}
*/
