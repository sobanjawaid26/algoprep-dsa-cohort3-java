package cohortHackerRank;

public class Found_Arrays2_ReversePartOfArray {

    public static void main(String[] args) {
        /*
        Input:
        10
        -3 4 2 8 3 9 6 2 8 10
        3 7
        Output:
        -3 4 2 2 6 9 3 8 8 10
         */
        int[] arr = {-3, 4, 2, 8, 3, 9, 6, 2, 8, 10};
        revereArray(arr, 3, 7);
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void revereArray(int[] arr, int start, int end){
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
