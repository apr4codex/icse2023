package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int n = events.length;
        if (n < 1) {
            return 0;
        }
        Arrays.sort(events, Comparator.comparingInt(e -> e[1]));
        int[] dp = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        for (int[] e : ev ents) {
            pq.offer(e);
            while (!pq.isEmpty() && pq.peek()[1] < e[0]) {
                pq.poll();
            }
            pq.offer(e);
            dp[e[0]] = Math.max(dp[e[0]], pq.stream().mapToInt(a -> a[2]).sum() + e[2]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    
}