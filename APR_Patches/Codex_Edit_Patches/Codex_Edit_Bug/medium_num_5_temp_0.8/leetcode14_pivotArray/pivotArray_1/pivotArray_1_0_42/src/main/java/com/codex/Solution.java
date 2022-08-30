package com.codex;

import java.util.*;

public class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            while (i <= j && nums[i] < pivot) {
                i++;
            }
            while (i <= j && nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 2, 0, 2, 1, 1};
        int pivot = 1;
        pivotArray(array, pivot);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}