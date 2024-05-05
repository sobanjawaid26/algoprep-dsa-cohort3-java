package dsa_levelUp_recording.arrays._001_arrays3;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3}, { 4, 5, 6 }, {7, 8, 9} };
        System.out.println("Array Before :");
        print2DArray(arr);

        transposeOfMatrix(arr);

        System.out.println("Array After : ");
        print2DArray(arr);
    }

    public static int[][] transposeOfMatrix(int[][] arr){
        // arr should be of size [N][N]
        int N = arr.length;
        for (int i = 0; i < N; i++){
            for (int j = 0;j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
