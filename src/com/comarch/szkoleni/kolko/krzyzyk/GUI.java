package com.comarch.szkoleni.kolko.krzyzyk;

import java.util.Scanner;

public class GUI {

    private Scanner scanner = new Scanner(System.in);
    public String move() {
        System.out.println("Choose field:");
        return this.scanner.nextLine();
    }

    public void showBoard(char[][] board) {
        for (char[] row : board) {
            System.out.println(row[0] + "|" + row[1] + "|" + row[2]);
        }
    }
}
