package lc_top_interview_150;

public class _26_392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        boolean res = isSubsequence(s, t);
        System.out.println(res);
    }
}
