package top_100_interview_programming_questions;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,6,7,8};
        int secLar = findSecondLargestElement(arr);
        System.out.println(secLar);
    }
    public static int findSecondLargestElement(int[] arr){
        int larg = arr[0];
        int secLar = -1;
         for (int i = 0; i< arr.length; i++){
             if (larg < arr[i]) {
                 secLar = larg;
                 larg = arr[i];
             } else if (secLar < arr[i] && arr[i] != larg) {
                 secLar = arr[i];
             }
         }
         return secLar;
    }
}
