package dsa_levelUp_recording.arrays._001_arrays2;

public class PrintAllSubArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printAllSubArray(arr);
    }

    public static void printAllSubArray(int[] arr){

        int n = arr.length;
        for(int s = 0; s <= n; s++){
            for(int e = s; e <= n; e++){
                // [s, e] subArray
                for(int i = s; i< e; i++)
                    System.out.print(arr[i]);
                System.out.println();
            }
        }
    }

}
