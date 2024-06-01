package lc_top_interview_150;

public class _2_27_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int left_most_index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left_most_index++] = nums[i];
            }
        }
        return left_most_index;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int nums1[] = {3,2,2,3};
        int val = 2;
        int res = removeElement(nums, val);
        System.out.println("Res : " + res);
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
