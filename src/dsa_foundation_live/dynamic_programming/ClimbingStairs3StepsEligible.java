package dsa_foundation_live.dynamic_programming;

import java.util.Arrays;

public class ClimbingStairs3StepsEligible {

    /*
            You are climbing a staircase. It takes n steps to reach the top.

            Each time you can either climb 1 or 2 or 3 steps. In how many distinct ways can you climb to the top?
                                           ------------
     */

    public int climbingStairs3StepsEligible(int n){
        int[] dpArr = new int[n + 1];
        Arrays.fill(dpArr, -1);
        return climbingStairs3StepsEligibleHelper(n, dpArr);
    }

    public int climbingStairs3StepsEligibleHelper(int n, int[] dpArr){
        if(n == 1 || n == 2 || n == 3)
            return n;
        if(dpArr[n] != -1)
            return dpArr[n];
        int a = climbingStairs3StepsEligibleHelper(n - 1, dpArr);
        int b = climbingStairs3StepsEligibleHelper(n - 2, dpArr);
        int c = climbingStairs3StepsEligibleHelper(n - 3, dpArr);
        dpArr[n] =  a + b + c;
        return a + b + c;
    }
}
