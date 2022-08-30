package com.codex;

import java.util.*;

public class Solution {
    public static int minOperations(int[][] grid, int x) {
        

        int numberOfOperations = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == x) continue;
                if ((x - grid[i][j]) % x != 0) return -1;
                numberOfOperations += (x - grid[i][j]) / x;
                
            }
        }
        return numberOfOperations;
    }

    
}