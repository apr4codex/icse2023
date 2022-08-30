package com.codex;

import java.util.*;

public class Solution {
    public static int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        
        if (dig.length == 0) return artifacts.length;        
        int[] digRow = new int[dig.length];
        int[] digCol = new int[dig.length];
        int m = artifacts.length, totalArtifacts = m;

        for (int i = 0; i < dig.length; i++) {
            digRow[i] = dig[i][0];
            digCol[i] = dig[i][1];
        }

        for (int i = 0; i < m; i++) {
            int[] artifact = artifacts[i];
            int col1 = artifact[2], col2 = artifact[3];
            int row1 = artifact[1], row2 = artifact[0];
            boolean rowCovered = false, colCovered = false;
            for (int j = 0; j < dig.length; j++) {
                if (digRow[j] >= row1 && digRow[j] <= row2) {
                    rowCovered = true;
                }
                if (digCol[j] >= col1 && digCol[j] <= col2) {
                    colCovered = true;
                }
            }
            if (rowCovered && colCovered) {
                totalArtifacts--;
            }
        }
        return totalArtifacts;
    }

    
}