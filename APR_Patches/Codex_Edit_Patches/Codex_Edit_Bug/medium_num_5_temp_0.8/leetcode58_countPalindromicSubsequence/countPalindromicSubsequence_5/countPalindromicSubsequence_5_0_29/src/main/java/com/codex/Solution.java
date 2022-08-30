package com.codex;

import java.util.*;

public class Solution {
    public static int countPalindromicSubsequence(String s) {
        
        if (s == null || s.length() < 2) {
            return 0;
        }
        int res = s.length();
        for (int i = 0; i < s.length() - 2; i++) {
            for (int j = i + 2; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    res++;
                }
            }
        }
        return res;
    }

    
}