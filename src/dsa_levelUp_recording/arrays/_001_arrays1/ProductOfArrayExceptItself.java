package dsa_levelUp_recording.arrays._001_arrays1;

import java.util.Arrays;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        System.out.println("ProductOfArrayExceptItself");
        int[] arr = {1,2,3,4};
        int[] res = productOfArrayExceptItself(arr);
    }

    public static int[] productOfArrayExceptItself(int[] arr){
        int n = arr.length;
        int[] prefixProd = new int[n];
        prefixProd[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefixProd[i] = prefixProd[i - 1] * arr[i];
        }

        int suffix = 0;
        for(int i = n - 1; i > 0; i--){
            prefixProd[i] = prefixProd[i - 1] * suffix;
            suffix = suffix * arr[i];
        }
        prefixProd[0] = suffix;
        Arrays.stream(prefixProd).forEach(System.out::println);
        return prefixProd;
    }
}
