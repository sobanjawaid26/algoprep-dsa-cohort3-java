package dsa_foundation_live.dynamic_programming;

import java.util.Arrays;

public class FibonacciUsingDP {

    public int fibonacciUsingDP(int N){

        int[] dpArray = new int[N + 1];
        Arrays.fill(dpArray, -1);

        return fibonacciHelperDP(N, dpArray);
    }

    public int fibonacciHelperDP(int N, int[] dpArray){
        if(N == 0 || N == 1)
            return N;
        if(dpArray[N] != -1)
            return dpArray[N];
        int a = fibonacciHelperDP(N - 1, dpArray);
        int b = fibonacciHelperDP(N - 2, dpArray);
        dpArray[N] = a + b;
        return a + b;
    }
}
