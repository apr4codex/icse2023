package com.codex;

import java.util.*;

public class Solution {
    public static boolean winnerOfGame(String colors) {
        
        int alice1 = 0;
        int bob = 0;
        char[] chars = colors.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(i == 0 || i == chars.length - 1) {
                if(chars[i] == 'A') {
                    ++alice1;
                }
            } else {
                if(chars[i] == 'A' && chars[i - 1] == 'A' && chars[i + 1] == 'A') {
                    ++alice1;
                } else if(chars[i] == 'B' && chars[i - 1] == 'B' && chars[i + 1] == 'B') {
                    ++bob;
                }
            }
        }
        return alice1 > bob;
    }

    
}