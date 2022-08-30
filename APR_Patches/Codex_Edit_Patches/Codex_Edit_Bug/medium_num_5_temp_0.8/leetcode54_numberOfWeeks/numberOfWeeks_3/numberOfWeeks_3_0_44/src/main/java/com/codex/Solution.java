package com.codex;

import java.util.*;

public class Solution {
    public static int numberOfWeeks(int[] milestones) {
        
        Arrays.sort(milestones);
        int ret = 0;
        for (int i = milestones.length - 1; i >= 0; i--) {
            ret += (milestones[i] - 1) / (milestones.length - i);
            if ((milestones[i] - 1) % (milestones.length - i) != 0) ret++;
        }
        return ret;
    }

    
}