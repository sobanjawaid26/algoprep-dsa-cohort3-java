package lc_top_interview_150;

import java.util.*;

public class _43_49_GroupAnagrams {

    /*
        Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        Example 2:
        Input: strs = [""]
        Output: [[""]]
        Example 3:
        Input: strs = ["a"]
        Output: [["a"]]
     */

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }
}
