package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(i <= chars.length - 3) {
                if(i == 0 && chars[i + 1] == 'A' && chars[i + 2] == 'A') {
                    ++alice;
                } else if(i == 0 && chars[i + 1] == 'B' && chars[i + 2] == 'B') {
                    ++bob;
                } else if(i > 0 && chars[i - 1] == 'A' && chars[i] == 'A' && chars[i + 1] == 'A' && chars[i + 2] == 'A') {
                    ++alice;
                } else if(i > 0 && chars[i - 1] == 'B' && chars[i] == 'B' && chars[i + 1] == 'B' && chars[i + 2] == 'B') {
                    ++bob;
                }
            } else if(i == chars.length - 2) {
                if(chars[i] == 'A' && chars[i + 1] == 'A') {
                    ++alice;
                } else if(chars[i] == 'B' && chars[i + 1] == 'B') {
                    ++bob;
                }
            }
        }
        return alice > bob;
    }

    
}