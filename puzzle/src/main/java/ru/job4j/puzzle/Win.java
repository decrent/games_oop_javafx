package ru.job4j.puzzle;

import java.util.Arrays;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int diagonal = 0; diagonal < board.length; diagonal++) {
            if (board[diagonal][diagonal] == 1) {
                for (int i = 0; i < board.length; i++) {
                    if (board[diagonal][i] != 0 || board[i][diagonal] != 0) {
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