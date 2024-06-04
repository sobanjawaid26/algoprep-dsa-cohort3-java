package lc_top_interview_150;

public class _23_28_FindTheIndexOfTheFirstOccurrenceInAString {

    public static int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needleLength = needle.length();
        if(hayLength <needleLength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }
}
