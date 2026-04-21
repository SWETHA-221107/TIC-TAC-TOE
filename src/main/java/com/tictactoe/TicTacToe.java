package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    // Method to get user input
    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();  // Read integer input

        return slot; // Return slot value to game logic
    }

    public static void main(String[] args) {
        int userSlot = getUserSlot();  // Call method

        System.out.println("You selected slot: " + userSlot);
    }
}