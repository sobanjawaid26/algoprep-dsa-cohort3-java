package cohortHackerRank;

import java.util.Scanner;

public class Found_Arrays2_Reverse_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        /*
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        revereArray(arr);
        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
        */
    }

    static void revereArray(int[] arr){
        for(int i = 0; i< arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
