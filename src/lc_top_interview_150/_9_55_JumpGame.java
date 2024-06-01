package lc_top_interview_150;

public class _9_55_JumpGame {
    public static boolean jumpGame(int[] nums) {
        int n = nums.length;
        if(n==1)
            return true;
        int max = 0;
        for(int index=0;index<n-1 && max>=index; index++){
            max = Math.max(max, index + nums[index]);
            if(max>=n-1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int jumps[] = {2,3,1,1,4};
        boolean canJump = jumpGame(jumps);
        System.out.println(canJump);
    }
}