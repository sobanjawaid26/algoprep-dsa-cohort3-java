package lc_top_interview_150;

import java.util.HashMap;
import java.util.Map;

public class _42_242_ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        for (char x : s.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for (char x : t.toCharArray()) {
            count.put(x, count.getOrDefault(x, 0) - 1);
        }

        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean res = isAnagram(s, t);
        System.out.println(res);
    }
}
