package com.codex;

import java.util.*;

public class Solution {
    public static int[] maxSubsequence(int[] nums, int k) {

        int n = nums.length;        
        int[] prefixSum = new int[n + 1];

        for(int i = 1; i <= n; ++i){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        int[] dp = new int[n + 1];
        int[] index = new int[n + 1];

        for(int i = 1; i <= k; ++i){
            int last = index[i - 1] + 1;
            while(last <= i && dp[i - 1] - prefixSum[last - 1] >= prefixSum[i] - prefixSum[last]){
                last++;
            }
            dp[i] = Math.max(dp[i - 1], prefixSum[i] - prefixSum[last - 1]);
            index[i] = last;
        }

        int[] ans = new int[k];
        int start = index[k];
        for(int i = k - 1; i >= 0; --i){
            while(start < k && prefixSum[k] - prefixSum[start] > dp[k] - prefixSum[start + 1]){
                start++;
            }
            ans[i] = k - start;
            k = start;
        }

        return ans;
    }
}