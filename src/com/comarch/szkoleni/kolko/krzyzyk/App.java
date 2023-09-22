package com.comarch.szkoleni.kolko.krzyzyk;

public class App {
    public static void main(String[] args) {
        Board board = new Board();
        GUI gui = new GUI();

        while(true) {
            gui.showBoard(board.getBoard());
            char[] coordinates = gui.move().toCharArray();
            int row = Character.getNumericValue(coordinates[0]);
            int col = Character.getNumericValue(coordinates[1]);

            board.markFiled(row, col, 'X');
            if(board.checkEnd()) {
                System.out.println("Wygral X");
                return;
            }

            gui.showBoard(board.getBoard());
            coordinates = gui.move().toCharArray();
            row = Character.getNumericValue(coordinates[0]);
            col = Character.getNumericValue(coordinates[1]);

            board.markFiled(row, col, 'O');
            if(board.checkEnd()) {
                System.out.println("Wygral O");
                return;
            }
        }
    }
}
