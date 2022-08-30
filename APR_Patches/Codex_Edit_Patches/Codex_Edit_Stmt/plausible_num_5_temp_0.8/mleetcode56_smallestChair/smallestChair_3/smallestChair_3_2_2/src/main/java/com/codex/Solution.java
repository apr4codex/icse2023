package com.codex;

import java.util.*;

public class Solution {
    public static int smallestChair(int[][] times, int targetFriend) {

        boolean[] chairs = new boolean[times.length + 2];

        for (int i = 0; i < times.length; i++) {
            chairs[times[i][0]] = true;
            chairs[times[i][1]] = false;
        }

        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i]) {
                targetFriend--;
            }
            if (targetFriend < 0) {
                return i;
            }
        }
        return -1;
    }

    
}