package dsa_levelUp_recording.arrays._001_arrays1;

public class SumInRangeForMultipleQuery {
/*
    Given N array elements and Q queries on an array, For each query calculate sum of all elements in given range

    arr[10] = {2, 5, 1, 3 ,4 ,1, 7, -8, 2, 0}

    Q = 5
   _________   Sum
   | 3 | 8 |    9
   | 2 | 4 |    8
   | 0 | 3 |    7
   | 5 | 9 |    11
   | 6 | 6 |    7
   ---------

   void sumInRangeForMultipleQuery(int arr[N], int Queries[Q][2])
*/

    static int[] sumInRangeForMultipleQuery(int arr[], int Queries[][]){

        int[] res = new int[Queries.length];
        int[] prefixSumArr = prefixSum(arr);
        for(int i = 0; i < Queries.length; i++){
            int L = Queries[i][0];
            int R = Queries[i][1];

            if(L > 0)
                res[i] = prefixSumArr[R] - prefixSumArr[L - 1];
            else
                res[i] = prefixSumArr[R];
        }
        return res;
    }

    static int[] prefixSum(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++){
            res[i] =  arr[i] + res[i - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3 ,4 ,1, 7, -8, 2, 0};
        int Query[][] = { { 3, 8 }, { 2, 4 } , { 0, 3 }, { 5, 9 }, {6, 6} };
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] res = sumInRangeForMultipleQuery(arr, Query);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
