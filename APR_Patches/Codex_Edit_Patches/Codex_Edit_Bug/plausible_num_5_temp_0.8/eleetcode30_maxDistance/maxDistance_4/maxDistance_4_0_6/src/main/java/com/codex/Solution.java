package com.codex;

import java.util.*;

public class Solution {
    public static int maxDistance(int[] colors) {
        int max = 0;
        
        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        
        
        int minDis = Math.min(Math.abs(range[0][0] - range[1][1]), Math.abs(range[0][0] - range[2][1]));
        minDis = Math.min(minDis, Math.abs(range[1][0] - range[2][1]));
        minDis = Math.min(minDis, Math.abs(range[0][1] - range[1][0]));
        minDis = Math.min(minDis, Math.abs(range[0][1] - range[2][0]));
        minDis = Math.min(minDis, Math.abs(range[1][1] - range[2][0]));
        
        return minDis == n ? 0 : minDis;
    }


    public static int maxDistance(int[] colors) {
        
        int n = colors.length;
        int[][] range = new int[3][2];
        for (int i = 0; i < 3; i++) {
            range[i] = new int[]{n, -1};
        }
        for (int i = 0; i < n; i++) {
            range[colors[i]][0] = Math.min(range[colors[i]][0], i);
            range[colors[i]][1] = Math.max(range[colors[i]][1], i);
        }
        int minDis = n - 1;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                minDis = Math.min(minDis, Math.abs(range[i][0] - range[j][1]));
                minDis = Math.min(minDis, Math.abs(range[j][0] - range[i][1]));
            }
        }
        return minDis;
    }
}