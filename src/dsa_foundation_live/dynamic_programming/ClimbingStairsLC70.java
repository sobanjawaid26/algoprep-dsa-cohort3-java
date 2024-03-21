package dsa_foundation_live.dynamic_programming;

import java.util.Arrays;

public class ClimbingStairsLC70 {

    /*

            You are climbing a staircase. It takes n steps to reach the top.

            Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



            Example 1:

            Input: n = 2
            Output: 2
            Explanation: There are two ways to climb to the top.
            1. 1 step + 1 step
            2. 2 steps
            Example 2:

            Input: n = 3
            Output: 3
            Explanation: There are three ways to climb to the top.
            1. 1 step + 1 step + 1 step
            2. 1 step + 2 steps
            3. 2 steps + 1 step
     */

    public int climbingStairs(int n){

        int dpArr[] = new int[n + 1];
        Arrays.fill(dpArr, -1);
        return climbingStairsHelper(n, dpArr);
    }

    private int climbingStairsHelper(int n, int[] dpArr) {

        if(n == 1 || n == 2)
            return n;
        if(dpArr[n] != -1)
            return dpArr[n];

        int a = climbingStairsHelper(n - 1, dpArr);
        int b = climbingStairsHelper(n - 2, dpArr);

        dpArr[n] = a + b;

        return a + b;
    }


}
