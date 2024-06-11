package lc_top_interview_150;

import java.util.HashMap;
import java.util.Map;

public class _39_383_RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (!dictionary.containsKey(c)) {
                dictionary.put(c, 1);
            } else {
                dictionary.put(c, dictionary.get(c) + 1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (dictionary.containsKey(c) && dictionary.get(c) > 0) {
                dictionary.put(c, dictionary.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct_0(String ransomNote, String magazine) {
        int arr[] = new int[26];

        for(char r : ransomNote.toCharArray()){
            arr[r - 'a']++;
        }

        for(char r : magazine.toCharArray()){
            arr[r - 'a']--;
        }

        for(int i: arr){
            if(i > 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote1 = "aa", magazine1 = "aab";
        String ransomNote = "aa", magazine = "ab";
        boolean res = canConstruct(ransomNote, magazine);

        System.out.println("res : " + res);
    }
}
