package com.codex;

import java.util.*;

public class Solution {
    public static int minimumSum(int num) {
        
        int minSum = Integer.MAX_VALUE;
        String numStr = String.valueOf(num);
        if(numStr.length() == 1) {
            return Integer.valueOf(numStr);
        }
        for (int i = 1; i < numStr.length(); i++) {
            int num1 = Integer.valueOf(numStr.substring(0, i));
            int num2 = Integer.valueOf(numStr.substring(i, numStr.length()));
            minSum = Math.min(minSum, num1 + num2);
        }
        return minSum;
    }

    
}