package dsa_levelUp_recording.arrays._001_arrays5;

public class MaxChunkSorted_2 {

    public static void main(String[] args) {
        int[] arr = {23,10,18,35,27,48,60,40,55};
        int[] arr2 = {13,7,12,22,18,26};
        int res = maxChunkSorted_2(arr2);
        System.out.println(res);
    }

    public static int maxChunkSorted_2(int[] arr){
        int N = arr.length;
        int[] prefixMax = getPrefixMaxArray(arr);
        int[] suffixMin = getSuffixMinArray(arr);

        int count = 0;

        for (int i = 0; i < N - 1; i++){
            if(prefixMax[i] <= suffixMin[i + 1])
                count++;
        }
        count++;
        return count;
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

    private static int[] getSuffixMinArray(int[] arr) {
        int n = arr.length;
        int[] sMin = new int[n];
        sMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--){
            sMin[i] = Math.min(sMin[i + 1], arr[i]);
        }
        return sMin;
    }
}
