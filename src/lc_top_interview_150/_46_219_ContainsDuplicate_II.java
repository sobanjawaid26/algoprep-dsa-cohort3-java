package lc_top_interview_150;

import java.util.*;

public class _46_219_ContainsDuplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int x = 0;
        for(int i=0; i<nums.length; i++){
            if(set.size() > k)
                set.remove(nums[x++]);
            if(!set.add(nums[i]))
                return true;
        }
        return false;
     }

    public static boolean containsNearbyDuplicate_0(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i])-i) <= k)
                return true;
            else
                map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3}, k = 2;
        int nums2[] ={1,2,3,1}, k2 = 3;
        boolean res = containsNearbyDuplicate_0(nums2, k2);
        System.out.println(res);
    }
}
