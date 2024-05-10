package dsa_levelUp_recording.arrays._001_arrays5;

public class PrintBoundaryNxNMatrixClockwiseDirection_Variation_1 {

    public static void printBoundaryNNMatrixClockwiseDirection(int mat[][]){
        int N = mat.length;
        int i = 0;
        int j = 0;

        for(int k = 0; k < N - 1; k++){
            System.out.println(mat[i][j]);
            j++;
        }
        for(int k = 0; k < N - 1; k++) {
            System.out.println(mat[i][j]);
            j++;
        }
        for(int k = 0; k < N - 1; k++) {
            System.out.println(mat[i][j]);
            j--;
        }
        for(int k = 0; k < N - 1; k++) {
            System.out.println(mat[i][j]);
            i--;
        }
    }
}
