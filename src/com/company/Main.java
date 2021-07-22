package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution heads_tails = new Solution();
        int[] array = {1, 0, 0, 1, 0, 1, 1};
        System.out.println("Массив из условных монет 0(Орёл) и 1(Решка): \n" + Arrays.toString(array));
        System.out.println("\nНадо перевернуть: " + heads_tails.solution(array) + " монеты");
    }
}


