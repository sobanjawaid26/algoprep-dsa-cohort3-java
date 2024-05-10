package dsa_levelUp_recording.arrays._001_arrays5;

public class MaxChunkSorted_1 {

    public static int maxChunkSorted_1(int[] arr){

        int N = arr.length;

        int maxTillNow = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < N; i++){
            maxTillNow = Math.max(maxTillNow, arr[i]);

            if(maxTillNow == i)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,4};
        int[] arr1 = {2,0,1,4,3,6,7,5,8};
        int[] arr2 = {4,3,2,1,0};
        int res = maxChunkSorted_1(arr2);
        System.out.println(res);
        // test commit
    }
}
