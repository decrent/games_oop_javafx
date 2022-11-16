package ru.job4j.puzzle;

import java.util.Arrays;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (monoHorizontal(board) || monoVertical(board)) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean rsl = false;
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] != 0) {
                for (int i = 0; i < board.length; i++) {
                    if (board[row][i] == 1) {
                        rsl = true;
                    } else {
                        rsl = false;
                    }
                }
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board) {
        boolean rsl = false;
        for (int column = 0; column < board.length; column++) {
            if (board[0][column] != 0) {
                for (int i = 0; i < board.length; i++) {
                    if (board[i][column] == 1) {
                        rsl = true;
                    } else {
                        rsl = false;
                        break;
                    }
                }
            }
        }
        return rsl;
    }
}