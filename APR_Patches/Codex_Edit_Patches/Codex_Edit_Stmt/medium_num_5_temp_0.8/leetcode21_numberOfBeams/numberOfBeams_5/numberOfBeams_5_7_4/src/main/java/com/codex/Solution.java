package com.codex;

import java.util.*;

public class Solution {
public static int numberOfBeams(String[] bank) {


        int n = bank.length;
        int m = bank[0].length();
        int[] ones = new int[n];//Массив для значений равных 1
        int res = 0;//Все суммы в массиве записываем в одну перменную
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {//Считаем сколько 1 в строке
                if (bank[i].charAt(j) == '1') {//Если 1, то увеличиваем значение в массиве
                    ones[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {//Выполняем только первое условие, остальное выполняется в цикле ниже
            if (ones[i] > 1) {//Если есть больше одной единицы, то увеличиваем значение res
                res += ones[i] * (ones[i] - 1) / 2;//Высчитываем сумму всех возможных комбинаций
            }

            for (int j = i + 1; j < n; j++) {//Выполняем следующее условие, если есть нули над единицами
                if (ones[j] == 0) {//Если в строке нет единиц, то увеличиваем значение res
                    res += ones[i];//Увеличиваем значение res на количество единиц в строке с которой сравниваем
                }
            }
        }

        return res;
    }
    }
}