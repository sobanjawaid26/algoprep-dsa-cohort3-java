package top_100_interview_programming_questions;

public class IsPrime {

    public static boolean isPrime(int n){
        if(n==1||n==0)return false;

        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    static boolean isPrime_0(int n){
        if(n==1||n==0) return false;

        for(int i=2; i<=n/2; i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
