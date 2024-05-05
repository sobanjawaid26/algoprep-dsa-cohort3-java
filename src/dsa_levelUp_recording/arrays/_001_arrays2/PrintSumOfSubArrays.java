package dsa_levelUp_recording.arrays._001_arrays2;

public class PrintSumOfSubArrays {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSumOfSubArrays(arr);
    }

    public static void printSumOfSubArrays(int[] arr){
        int[] prefixSumArr = prefixSum(arr);
        int n = arr.length;
        for(int s = 0; s < n; s++){
            for(int e = s; e < n; e++){
                // [s, e] subArray
                if(s == 0)
                    System.out.print(prefixSumArr[e]);
                else
                    System.out.print(prefixSumArr[e] - prefixSumArr[s -1]);
                System.out.println();
            }
        }
    }

    static int[] prefixSum(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            res[i] =  arr[i] + res[i - 1];
        }
        return res;
    }
}
