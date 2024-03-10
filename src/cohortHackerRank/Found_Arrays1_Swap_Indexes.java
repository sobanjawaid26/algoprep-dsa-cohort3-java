package cohortHackerRank;

import java.util.Scanner;

public class Found_Arrays1_Swap_Indexes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;

        for(int i = 0; i< n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
