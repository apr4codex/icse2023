package com.codex;

import java.util.*;

public class Solution {
    public static int wateringPlants(int[] plants, int capacity) {
        
        int steps = 0;
        int i = 0;
        int x = -1;
        int water = capacity;
        while (i < plants.length) {
            if (x >= 0) {
                if (water < plants[i]) {
                    x = 0;
                } else {
                    steps++;
                    water -= plants[i];
                    i++;
                    x = 1;
                }
            } else {
                water = capacity;
                steps++;
            }
        }
        return steps;
    }
}