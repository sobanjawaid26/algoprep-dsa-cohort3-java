package lc_top_interview_150;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _41_290_WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;

        Map<Character, Integer> charIndexMap = new HashMap<>();
        Map<String, Integer> wordIndexMap = new HashMap<>();

        for (int i = 0; i < words.length; ++i) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Using Integer to avoid unboxing issues and null values
            Integer charIndex = charIndexMap.put(c, i);
            Integer wordIndex = wordIndexMap.put(word, i);

            // Check if the current mapping is different from previous occurrences
            if (!Objects.equals(charIndex, wordIndex)) {// cant use other comparasion techies
                return false;
            }
        }
        return true;
    }

    public boolean wordPattern_0(String pattern, String s) {
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c)){
                if(!map.get(c).equals(word[i])){
                    return false;
                }
            }else {
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(c, word[i]);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        String pattern1 = "abba", s1 = "dog cat cat fish";
        boolean res = wordPattern(pattern1, s1);
        System.out.println(res);
    }
}
