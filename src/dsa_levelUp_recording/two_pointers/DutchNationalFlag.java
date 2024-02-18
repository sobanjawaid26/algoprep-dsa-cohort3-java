package dsa_levelUp_recording.two_pointers;

public class DutchNationalFlag {

    public static int[] sortDutchNationalFlag(int[] arr){

        int N = arr.length;
        int i = 0;
        int j = 0;
        int k = N - 1;

        while( j <= k){
            if(arr[j] == 0){
                swap(arr, i, j);
                i++;
                j++;
            }
            else if(arr[j] == 1){
                j++;
            }
            else {
                swap(arr, j, k);
                k--;
            }
        }
        return arr;
    }
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 1, 2, 1, 0, 0, 1, 2};

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        int res[] = sortDutchNationalFlag(arr);

        for(int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");

    }
}
