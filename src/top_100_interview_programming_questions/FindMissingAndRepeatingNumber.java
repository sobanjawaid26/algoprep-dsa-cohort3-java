package top_100_interview_programming_questions;

import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeatingNumber {

            /*
            Input: arr[] = {3, 1, 3}
            Output: Missing = 2, Repeating = 3
            Explanation: In the array, 2 is missing and 3 occurs twice

            Input: arr[] = {4, 3, 6, 2, 1, 1}
            Output: Missing = 5, Repeating = 1
         */

    public static void findMissingAndRepeatingNumber_0(int[] arr){
        Map<Integer, Boolean> numberMap = new HashMap<>();

        int max = arr.length;

        for (Integer i : arr) {

            if (numberMap.get(i) == null) {
                numberMap.put(i, true);
            }
            else {
                System.out.println("Repeating = " + i);
            }
        }
        for (int i = 1; i <= max; i++) {
            if (numberMap.get(i) == null) {
                System.out.println("Missing = " + i);
                break;
            }
        }
    }
    public static void findMissingAndRepeatingNumber(int[] arr){
        int n = arr.length;
        int[] temp = new int[n]; // Creating temp array of size n
        // with initial values as 0.
        int repeatingNumber = -1;
        int missingNumber = -1;

        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;
            if (temp[arr[i] - 1] > 1) {
                repeatingNumber = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }

        System.out.println("The repeating number is "
                + repeatingNumber + ".");
        System.out.println("The missing number is "
                + missingNumber + ".");
    }

    public static void main(String[] args) {
        int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
        findMissingAndRepeatingNumber(arr);
    }
}
