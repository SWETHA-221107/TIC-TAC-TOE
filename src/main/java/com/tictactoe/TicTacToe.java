package com.tictactoe;

public class TicTacToe {

    // Function to initialize the board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Function to display the board
    public static void displayBoard(char[][] board) {
        System.out.println("\nTic-Tac-Toe Board:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[3][3]; // 2D array

        initializeBoard(board); // Initialize with '-'
        displayBoard(board);    // Print board
    }
}
