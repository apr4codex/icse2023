package com.codex;

import java.util.*;

public class Solution {
    public static long maximumSubsequenceCount(String text, String pattern) {
        
        long res = 0;
        long[] a = new long[26];
        for (int i = 0; i < 26; i++) {
            a[i] = 0;
        }

        for (int i = 0; i < text.length(); i++) {
            a[text.charAt(i) - 'a']++;
        }
        for (int i = 0; i < pattern.length(); i++) {
            a[pattern.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            res += Math.max(0, a[i]);
        }
        return res;
    }

    
}