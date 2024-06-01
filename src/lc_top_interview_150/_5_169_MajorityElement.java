package lc_top_interview_150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _5_169_MajorityElement {

    // SORTING ALLOWED
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
    // SORTING NOT ALLOWED
    public static int majorityElement_0(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            //System.out.println(map);
        }

        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }
    // SORTING NOT ALLOWED
    public static int majorityElement_00(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        //int majEle = majorityElement_0(nums);
        //int majEle = majorityElement_0(nums);
        int majEle = majorityElement_00(nums);
        System.out.println(majEle);
    }
}
