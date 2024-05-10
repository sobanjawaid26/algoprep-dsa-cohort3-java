package dsa_levelUp_recording.arrays._001_arrays5;

public class PrintSpiralNxNMatrixClockwiseDirection_Variation_2 {

    public static void printSpiralNxNMatrixClockwiseDirection_Variation_2(int mat[][]){
        int N = mat.length;
        int i = 0;
        int j = 0;
        int steps = N - 1;

        while(steps >= 1){
            for(int k = 0; k < steps; k++){
                System.out.println(mat[i][j]);
                j++;
            }
            for(int k = 0; k < steps; k++) {
                System.out.println(mat[i][j]);
                i++;
            }
            for(int k = 0; k < steps; k++) {
                System.out.println(mat[i][j]);
                j--;
            }
            for(int k = 0; k < steps; k++) {
                System.out.println(mat[i][j]);
                i--;
            }
            i++;
            j++;
            steps = steps - 2;
        }
        if (steps == 0)
            System.out.println(mat[i][j]);
    }
}
