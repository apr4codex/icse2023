package com.codex;

import java.util.*;

public class Solution {
public static int countCollisions(String directions) {

    int totalCollision = 0;
    char[] dirs = directions.toCharArray();
    for (int i = 0; i < dirs.length; i++) {
        boolean skip = false;
        for (int j = i+1; j < dirs.length; j++) {
            if (dirs[i] == dirs[j]) {
                skip = true;
                break;
            } else {
                if (dirs[i] != 'S' && dirs[j] != 'S') {
                    totalCollision += 2;
                    dirs[i] = 'S';
                    dirs[j] = 'S';
                } else {
                    totalCollision += 1;
                    if (dirs[i] != 'S') {
                        dirs[i] = 'S';
                    }
                    if (dirs[j] != 'S') {
                        dirs[j] = 'S';
                    }
                }
                skip = true;
                break;
            }
        }

        return totalCollision;
    }

    
}