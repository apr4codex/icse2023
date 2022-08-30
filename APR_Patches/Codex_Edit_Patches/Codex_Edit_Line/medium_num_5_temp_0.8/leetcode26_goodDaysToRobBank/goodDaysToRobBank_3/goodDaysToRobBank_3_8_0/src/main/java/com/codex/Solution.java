package com.codex;

import java.util.*;

public class Solution {

    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        

        List<Integer> res = new ArrayList<>();
        int[] nonInc = new int[security.length];
        int[] nonDec = new int[security.length];
        int min = security[0];
        int max = security[security.length - 1];
        for (int i = 0; i < security.length; i++) {
            min = Math.min(security[i], min);
            nonInc[i] = min;
        }
        for (int i = security.length - 1; i >= 0; i--) {
            max = Math.max(security[i], max);
            nonDec[i] = max;
        }
        for (int i = 0; i < security.length; i++) {
            if (i >= time && i <= security.length - time - 1 && nonInc[i - time] <= security[i] && security[i] <= nonDec[i + time]) {
                res.add(i);
            }
        }
        return res;
    }

   
    public static int[] dedup(int[] arr) {
        // Write your code here
        // for uniques, use hashset
        int[] res = new int[arr.length];
        Set<Integer> set = new HashSet<>();
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                res[j] = arr[i];
                set.add(arr[i]);
                j++;
            }
        }
        return Arrays.copyOf(res, j);
    }
}