package dsa_levelUp_recording.arrays._001_arrays2;

public class KadaneAlgoSubArraySum {

    public static void main(String[] args) {
        int[] arr = {3,4,2,-14, 16,-20,5};
        int res = kadaneAlgoSubArraySum(arr);
        System.out.println(res);
    }

    public static int kadaneAlgoSubArraySum(int[] arr){
        int n = arr.length;
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if(sum >= 0){
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
