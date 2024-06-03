package lc_top_interview_150;

public class _21_151_ReverseWordsInAString {

    public static String reverseWords(String s) {
        if (s == null) return null;

        char[] arr = s.toCharArray();
        int n = arr.length;

        // step 1. reverse the whole string
        reverse(arr, 0, n - 1);
        // step 2. reverse each word
        reverseWords(arr, n);
        // step 3. clean up spaces
        return cleanSpaces(arr, n);
    }

    static void reverseWords(char[] a, int n) {
        int i = 0, j = 0;

        while (i < n) {
            while (i < j || i < n && a[i] == ' ') i++; // skip spaces
            while (j < i || j < n && a[j] != ' ') j++; // skip non spaces
            reverse(a, i, j - 1);                      // reverse the word
            printArr(a);
        }
    }

    // trim leading, trailing and multiple spaces
    static String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;

        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep non spaces
            while (j < n && a[j] == ' ') j++;             // skip spaces
            if (j < n) a[i++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, i);
    }

    // reverse a[] from a[i] to a[j]
    private static void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
        printArr(a);
    }
    public String reverseWords_0(String s) {
        String ans="";
        String[] words=s.split("\\s+");
        for(String w : words){
            if(ans=="") ans=w;
            else ans=w+" "+ans;
        }
        return ans;
    }
    public static void printArr(char[] arr){
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        String res = reverseWords(str);
        System.out.println(res);
    }
}
