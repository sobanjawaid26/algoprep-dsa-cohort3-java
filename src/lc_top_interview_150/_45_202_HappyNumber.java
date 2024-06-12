package lc_top_interview_150;

import java.util.HashSet;
import java.util.Set;

public class _45_202_HappyNumber {
    public static boolean isHappy(int n) {
        Set<Long> seenNumbers = new HashSet<>();
        long m = n;
        while (m != 1 && !seenNumbers.contains(m)) {
            seenNumbers.add(m);
            long sum = 0;
            while (m > 0) {
                long digit = m % 10;
                sum += digit * digit;
                m /= 10;
            }
            m = sum;
        }
        return m == 1;
    }
    public static void main(String[] args) {
        int n = 19;
        boolean res = isHappy(n);
        System.out.println(res);
    }
}
