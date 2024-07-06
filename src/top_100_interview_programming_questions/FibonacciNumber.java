package top_100_interview_programming_questions;

public class FibonacciNumber {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

    public static void main(String[] args) {
        int n = 9;
        int fibNum = fibonacciNumber(n);
        System.out.println(fibNum);
    }
    public static int fibonacciNumber(int n){
        int a = 0, b = 1, c;
        if(n == 0)
            return a;
        for (int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
