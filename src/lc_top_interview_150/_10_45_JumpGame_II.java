package lc_top_interview_150;

public class _10_45_JumpGame_II {

    public static int jump(int[] nums) {
        int jumps = 0;
        int current = 0;
        int farthest = 0;

        for(int i = 0; i< nums.length - 1; i++){
            farthest = Math.max(farthest, nums[i] + i);
            if(i == current){
                current = farthest;
                jumps++;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int jumps[] = {2,3,1,1,4};
        int countJumps = jump(jumps);
        System.out.println(countJumps);
    }
}
