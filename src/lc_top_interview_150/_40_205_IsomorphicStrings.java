package lc_top_interview_150;

import java.util.HashMap;

public class _40_205_IsomorphicStrings {

    /*
        Example 1:
            Input: s = "egg", t = "add"
            Output: true
        Example 2:
            Input: s = "foo", t = "bar"
            Output: false
        Example 3:
            Input: s = "paper", t = "title"
            Output: true
     */
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp = new HashMap<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!mp.containsKey(ch1)){
                if(mp.containsValue(ch2))
                    return false;
                else mp.put(ch1,ch2);
            }else{
                if(ch2!=mp.get(ch1))
                    return false;
            }
        }
        return true;
    }

    public boolean isIsomorphic_0(String s, String t) {
        int[] indexS = new int[200];
        int[] indexT = new int[200];
        int len = s.length();
        if(len != t.length()) {
            return false;
        }
        for(int i = 0; i < len; i++) {
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1;
            indexT[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        boolean res = isIsomorphic(s, t);
        System.out.println(res);
    }
}
