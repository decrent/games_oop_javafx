package ru.job4j.puzzle;

import java.util.Arrays;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (monoHorizontal(board) || monoVertical(board)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoHorizontal(int[][] board) {
        boolean rsl = false;
        int[] array = new int[board.length];
        int[] check = {1, 1, 1, 1, 1};
        for (int row = 0; row < board.length; row++) {
            for (int i = 0; i < board.length; i++) {
                if (board[row][i] == 1) {
                    array[i] = 1;
                }
            }
            if (Arrays.equals(array, check)) {
                return true;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(int[][] board) {
        boolean rsl = false;
        int[] array = new int[board.length];
        int[] check = {1, 1, 1, 1, 1};
        for (int column = 0; column < board.length; column++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][column] == 1) {
                    array[i] = 1;
                }
            }
            if (Arrays.equals(array, check)) {
                return true;
            }
        }
        return rsl;
    }
}