package com.comarch.szkoleni.kolko.krzyzyk;

public class Board {
    private final char[][] board = new char[3][3];

    public char[][] getBoard() {
        return board;
    }

    public void markFiled(int row, int col, char sign) {
        if(sign != 'X' && sign != 'O') {
            return;
        }
        this.board[row][col] = sign;
    }

    public boolean checkEnd() {
        for (char[] row : this.board) {
            if(row[0] == row[1] && row[1] == row[2] && row[0] != 0) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if(this.board[0][col] == this.board[1][col] &&
                    this.board[1][col] == this.board[2][col] &&
                    this.board[2][col] != 0) {
                return true;
            }
        }

        if(this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2] && this.board[0][0] != 0) {
            return true;
        }

        if(this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0] && this.board[2][0] != 0) {
            return true;
        }


        for(char[] row : this.board) {
            for(char element : row) {
                if(element == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
