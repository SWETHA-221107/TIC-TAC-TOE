package com.tictactoe;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Loop for 9 turns
        for (int turn = 0; turn < 9; turn++) {

            char currentPlayer = (turn % 2 == 0) ? 'X' : 'O';
            System.out.println("\nPlayer " + currentPlayer + "'s turn");

            int slot = getUserSlot();

            // Convert slot (1–9) → row & column (0–2)
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Validate move (UC5)
            if (validateMove(board, row, col)) {
                board[row][col] = currentPlayer;
            } else {
                System.out.println("Invalid move! Try again.");
                turn--; // retry same player
                continue;
            }

            // Display board
            printBoard(board);
        }

        System.out.println("Game Over!");
    }

    // UC3: Get valid user input (1–9)
    static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter slot (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot;
            } else {
                System.out.println("Invalid input! Please enter between 1 and 9.");
            }
        }
    }

    // UC5: Validate move
    static boolean validateMove(char[][] board, int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-');
    }

    // Display board
    static void printBoard(char[][] board) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}