package lc_top_interview_150;

import java.util.ArrayList;
import java.util.List;

public class _48_228_SummaryRanges {
    /*
        Example 1:
            Input: nums = [0,1,2,4,5,7]
            Output: ["0->2","4->5","7"]
            Explanation: The ranges are:
            [0,2] --> "0->2"
            [4,5] --> "4->5"
            [7,7] --> "7"
        Example 2:
            Input: nums = [0,2,3,4,6,8,9]
            Output: ["0","2->4","6","8->9"]
            Explanation: The ranges are:
            [0,0] --> "0"
            [2,4] --> "2->4"
            [6,6] --> "6"
            [8,9] --> "8->9"
     */
    public static List<String> summaryRanges(int[] nums) {
        StringBuilder s = new StringBuilder("");
        List<String> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i < nums.length-1 && nums[i] == nums[i+1]-1){
                s.append(nums[i]).append("->");
                while(i < nums.length-1 && nums[i] == nums[i+1]-1){
                    i++;
                }
                s.append(nums[i]);
                list.add(s.toString());
                s.setLength(0);
            }else{
                list.add(nums[i]+"");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,7};
        List<String> res = summaryRanges(nums);
        System.out.println(res);
    }
}
