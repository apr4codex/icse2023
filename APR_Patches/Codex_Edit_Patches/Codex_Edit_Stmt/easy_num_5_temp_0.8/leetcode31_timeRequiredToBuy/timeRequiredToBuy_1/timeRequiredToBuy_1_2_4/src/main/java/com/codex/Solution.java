package com.codex;

import java.util.*;

public class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        
        int[] counter = new int[tickets.length];
        for (int i = 0; i < tickets.length; i++) {
            counter[i] = tickets[i];
        }
        int time = 0;
        while (counter[k] > 0) {
            time++;
            for (int i = 0; i < counter.length; i++) {
                counter[i] = Math.max(0, counter[i] - 1);
            }
        }
        return time;
    }
}