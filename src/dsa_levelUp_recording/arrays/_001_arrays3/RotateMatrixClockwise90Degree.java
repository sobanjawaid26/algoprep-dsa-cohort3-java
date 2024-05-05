package dsa_levelUp_recording.arrays._001_arrays3;

import static dsa_foundation_live.arrays.ReverseAnArray.reverseArray;

public class RotateMatrixClockwise90Degree {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3}, { 4, 5, 6 }, {7, 8, 9} };
        TransposeOfMatrix.print2DArray(arr);

        rotateMatrixClockwise90Degree(arr);
        TransposeOfMatrix.print2DArray(arr);
        /*
            1 4 7
            2 5 8
            3 6 9
         */
    }

    public static void rotateMatrixClockwise90Degree(int[][] arr){
        int N = arr.length;
        // first transpose , then reverse each row
        TransposeOfMatrix.transposeOfMatrix(arr);

        for (int i = 0; i < N; i++){
            int[] tempArr = arr[i];
            reverseArray(tempArr);
        }
    }
}
