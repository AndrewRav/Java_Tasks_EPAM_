package com.company;

public class Solution {

    public int solution(int[] A) {
        int i, tails = 0, heads = 0;
        for (i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                tails++;
            } else if (A[i] == 0) {
                heads++;
            } else {
                break;
            }
        }

        if (tails == heads) {
            return tails;
        } else if (tails - heads > 0) {
            return heads;
        } else if (tails - heads < 0) {
            return tails;
        } else {
            return 0;
        }
    }
}

