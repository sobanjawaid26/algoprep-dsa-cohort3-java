package dsa_levelUp_recording.arrays._001_arrays2;

public class NumberOfSubArraysWithBoundedMaximum {

    public static void main(String[] args) {
        int[] arr = {9, 6, 8, 7 , 5,4, 1,10, 6, 8};
        int res = validSubArray(arr, 6,8);
        System.out.println(res);
    }

    public static int validSubArray(int[] arr, int right, int left){
        /*
            Given arr[n] and two integer left and right.
            Return the number of subArrays such that value of maximum array element in that subArray
            is in the range of {left, right}
         */
        int N = arr.length;
        int ans = 0;
        int lgei = 0;
        int prevValidCount = 0;

        for (int ep = 0; ep < N; ep++){
            if (arr[ep] > right){
                ans = ans + 0;
                prevValidCount = 0;
                lgei = ep + 1;
            } else if(arr[ep] >= left && arr[ep] <= right){
                ans = ans + (ep - lgei + 1);
                prevValidCount = ep - lgei + 1;
            } else { /// arr[ep] < left
                ans = ans + prevValidCount;
            }
        }
        return ans;
    }
}
