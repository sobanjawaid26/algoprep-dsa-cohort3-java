package dsa_levelUp_recording.arrays._001_arrays2;

public class ContributionTechnique_PrintSumOfSubArrays {

    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 8};
        int res = contributionTechnique_PrintSumOfSubArrays(arr);
        System.out.println(res);
    }

    public static int contributionTechnique_PrintSumOfSubArrays(int[] arr){
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            int occurrence = (i + 1) * (n - 1);
            sum = sum + (occurrence + arr[i]);
        }
        return sum;
    }
}
