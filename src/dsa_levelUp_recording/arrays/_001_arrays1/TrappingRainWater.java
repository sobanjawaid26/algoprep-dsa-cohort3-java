package dsa_levelUp_recording.arrays._001_arrays1;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int res = trappingRainWater(arr);
        System.out.println("res : " + res );
    }

    public static int trappingRainWater(int[] arr){

        int N = arr.length;
        int[] prefixMax = getPrefixMaxArray(arr);
        int[] suffixMax = getSuffixMaxArray(arr);

        int totalRainTrapped = 0;

        for(int i = 1; i< N - 1; i++){
            int leftBlockade  = prefixMax[i - 1];
            int rightBlockade = suffixMax[i + 1];
            int yourBlockade = Math.min(leftBlockade, rightBlockade);
            int contribution = yourBlockade - arr[i];

            if(contribution > 0)
                totalRainTrapped = totalRainTrapped + contribution;
        }
        return totalRainTrapped;
    }

    private static int[] getSuffixMaxArray(int[] arr) {
        int n = arr.length;
        int[] sMax = new int[n];
        sMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--){
            sMax[i] = Math.max(sMax[i + 1], arr[i]);
        }
        return sMax;
    }

    private static int[] getPrefixMaxArray(int[] arr) {
        int n = arr.length;
        int[] pMax = new int[arr.length];
        pMax[0] = arr[0];

        for(int i = 1; i < n; i++){
            pMax[i] = Math.max(pMax[i - 1], arr[i]);
        }
        return pMax;
    }
}
