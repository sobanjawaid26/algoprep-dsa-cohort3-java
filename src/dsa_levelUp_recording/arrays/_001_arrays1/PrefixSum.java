package dsa_levelUp_recording.arrays._001_arrays1;

public class PrefixSum {

/*
    Given N array elements, return Pf[] where Pf[i]:{sum{arr[0]}, sum{arr[1]}, .........sum{arr[i]}}

    Ex : arr[5] = {4, 1, 6, -2, 7}
          Pf[5] = {4, 5, 11, 9, 16}
*/

    static int[] prefixSum(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            res[i] =  arr[i] + res[i - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 6, -2, 7};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] res = prefixSum(arr);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
