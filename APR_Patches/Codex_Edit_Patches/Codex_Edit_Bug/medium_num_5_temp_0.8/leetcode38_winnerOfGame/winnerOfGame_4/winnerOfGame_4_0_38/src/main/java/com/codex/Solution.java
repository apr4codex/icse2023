package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
        }
        return isWinningPossibility(colors);
    }

    private static boolean isWinningPossibility(String colors) {
        if (colors.length() == 0) {
            return false;
        } else if (colors.length() == 1) {
            return true;
       }

        StringBuilder sb = new StringBuilder(colors);
        int index = 0;
        while (index + 2 < sb.length()) {
            char start = sb.charAt(index);
            char mid = sb.charAt(index + 1);
            char end = sb.charAt(index + 2);
            if (start == mid && mid == end) {
                sb.deleteCharAt(index + 1);
                index = index + 1;
            } else {
                index++;
            }
        }
        return isWinningPossibility(sb.toString());
    }
}