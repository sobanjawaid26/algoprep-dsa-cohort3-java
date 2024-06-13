package lc_top_interview_150;

import java.util.HashSet;
import java.util.Set;

public class _47_128_LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i: nums){
            hs.add(i);
        }
        System.out.println(hs);
        int c =0;

        for (int x:hs){
            if(!hs.contains(x-1)){
                int y = x+1;
                while(hs.contains(y)){
                    y++;
                }
                c= Math.max(c,y-x);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int[] nums1 = {100,4,200,1,3,2};
        int res = longestConsecutive(nums1);
        System.out.println(res);
    }
}
