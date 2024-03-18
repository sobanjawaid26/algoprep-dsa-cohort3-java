package cohortHackerRank;

public class Found_Arrays2_Rotate_Array {

    public static void main(String[] args) {
        /*
        Input:
        7
        1 2 3 4 5 6 7
        3
        Output:
        5 6 7 1 2 3 4
        Solution:
        4321765
        5671234
         */
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
        reverseArray(arr, 0, k);
        reverseArray(arr, k + 1, n - 1);
        reverseArray(arr, 0, n - 1);
        for(int i = 0; i< arr.length; i++)
            System.out.print(arr[i] + " ");

    }
    static void reverseArray(int[] arr, int start, int end){
        int sp = start;
        int ep = end;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
}
