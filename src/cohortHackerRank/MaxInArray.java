package cohortHackerRank;

import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currMax = Integer.MIN_VALUE;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int curr = sc.nextInt();
            currMax = (curr > currMax) ? curr : currMax;
        }
        System.out.println(currMax);
    }
}
