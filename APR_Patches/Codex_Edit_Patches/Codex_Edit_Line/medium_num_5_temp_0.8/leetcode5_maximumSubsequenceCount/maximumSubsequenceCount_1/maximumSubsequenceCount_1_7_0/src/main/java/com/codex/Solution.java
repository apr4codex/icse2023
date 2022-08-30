package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        int[][] dp = new int[text.length() + 1][pattern.length() + 1];
        for (int i = 0; i < text.length(); i++) dp[i][0] = 1;
        for (int j = 1; j <= pattern.length(); j++) dp[0][j] = 0;
        for (int i = 1; i <= text.length(); i++) {
            for (int j = 1; j <= pattern.length(); j++) {
                dp[i][j] = dp[i - 1][j];
				// Fix
				// if (text.charAt(i - 1) == pattern.charAt(j - 1)) {
                if (text.charAt(i - 1) == pattern.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
            }
        }
        return dp[text.length()][pattern.length()];
    }

    
}