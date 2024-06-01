package lc_top_interview_150;

public class _3_26_RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
