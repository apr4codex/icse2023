package com.codex;

import java.util.*;

public class Solution {
private boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean[][] f = new boolean[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                //分成空正则和非空正则两种
                if (j == 0) {
                    f[i][j] = i == 0;
                } else {
                    //非空正则分为两种情况 * 和 非*
                    if (p.charAt(j - 1) != '*') {
                        if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                            f[i][j] = f[i - 1][j - 1];
                        }
                    } else {
                        //碰到 * 了，分为看和不看两种情况
                        //不看
                        if (j >= 2) {
                            f[i][j] |= f[i][j - 2];
                        }
                        //看
                        if (i >= 1 && j >= 2 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                            f[i][j] |= f[i - 1][j];
                        }
                    }
                }
            }
        }
        count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == 0) count++;
            right[i] = count;
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] + right[i] > max) {
                ans.clear();
                ans.add(i);
                max = left[i] + right[i];
            } else if (left[i] + right[i] == max) {
                ans.add(i);
            }
        }
        return ans;
    }
    
}