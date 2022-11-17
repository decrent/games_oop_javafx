package ru.job4j.puzzle;

import java.util.Arrays;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int askew = 0; askew < board.length; askew++) {
            if (board[askew][askew] == 1) {
                for (int i = 0; i < board.length; i++) {
                    if (board[askew][i] != 0 || board[i][askew] != 0) {
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