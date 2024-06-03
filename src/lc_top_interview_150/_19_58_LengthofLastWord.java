package lc_top_interview_150;

public class _19_58_LengthofLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }

        return length;
    }

    public static int lengthOfLastWord_0(String s) {
        int count=0,i;
        i=s.length()-1;
        for(int j=i;j>=0;j--){
            if(s.charAt(j)!=' '){
                count++;
            }
            else if(count>0){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        int len = lengthOfLastWord_0(str);
        System.out.println(len);
    }
}
