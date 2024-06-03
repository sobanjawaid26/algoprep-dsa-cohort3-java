package lc_top_interview_150;

public class _16_42_TrappingRainWater {

    public static int trap(int[] arr) {
        int n = arr.length;

        int[] prefixmax = new int[n];
        int[] suffixmax = new int[n];

        prefixmax[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixmax[i] = Math.max(prefixmax[i-1],arr[i]);
        }

        suffixmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmax[i] = Math.max(suffixmax[i+1],arr[i]);
        }

        int ans = 0;
        for(int i =1; i<n;i++){
            ans+= Math.min(prefixmax[i],suffixmax[i]) - arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = trap(arr);
        System.out.println(trappedWater);
    }
}
