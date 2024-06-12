package lc_top_interview_150;

import java.util.HashMap;
import java.util.Map;

public class _44_1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return new int[]{i, numMap.get(complement)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15}, target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}