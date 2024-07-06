package top_100_interview_programming_questions;

import java.util.HashMap;
import java.util.Map;

public class NumberOfMatchingCharactersInPairOfString {

    static int count(String str1, String str2) {
        int c = 0, j = 0;

        // Traverse the string 1 char by char
        for (int i = 0; i < str1.length(); i++) {

            // This will check if str1[i]
            // is present in str2 or not
            // str2.find(str1[i]) returns -1 if not found
            // otherwise it returns the starting occurrence
            // index of that character in str2
            if (str2.indexOf(str1.charAt(i)) >= 0) {
                c += 1;
            }
        }
        return c;
    }

    public static int countMatchingCharacters_0(String str1, String str2) {
        // Create a HashMap to store character frequencies in str1
        Map<Character, Integer> charCount = new HashMap<>();
        int count = 0;

        // Count characters in str1
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Check for matching characters in str2
        for (char c : str2.toCharArray()) {
            if (charCount.containsKey(c) && charCount.get(c) > 0) {
                count++;
                charCount.put(c, charCount.get(c) - 1);
            }
        }

        return count;
    }

    // Driver code
    public static void main (String[] args) {
        String str1 = "abcdef", str2 = "defghia";

        int count1 = count(str1, str2);
        System.out.println(count1);

        int count2 = countMatchingCharacters_0(str1, str2);
        System.out.println(count1);
    }
}
