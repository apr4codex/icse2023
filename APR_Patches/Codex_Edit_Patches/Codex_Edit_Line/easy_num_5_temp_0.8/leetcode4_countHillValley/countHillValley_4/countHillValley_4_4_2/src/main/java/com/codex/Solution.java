package com.codex;

import java.util.*;

public class Solution {
//Дан массив из натуральных чисел. Необходимо создать программу, которая будет искать в массиве все холмы и долины,
// и возвращать их количество.

//Холмом будем называть пару элементов, в которой первый элемент меньше следующего.
//Долиной назовем пару элементов, в которой первый элемент больше следующего.

//Например, в массиве [1, 2, 3, 4, 5, 6, 7] холмы - [1, 2], [2, 3], [4, 5], [5, 6], [6, 7].
//Долины - [3, 4], [7, 6].

//Напишите метод, который решает эту задачу.

//Сигнатура метода:

//public static int countHillValley(int[] nums)

//Пример:

//countHillValley({2, 1, 3, 4, 3, 2, 1, 2, 3})

//Результат:

//4.



    public static int countHillValley(int[] nums) {
        

        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                count++;
            }
            if (nums[i-1] > nums[i] && nums[i] < nums[i+1]) {
                count++;
            }
        }
        return count;
    }


    
    
}