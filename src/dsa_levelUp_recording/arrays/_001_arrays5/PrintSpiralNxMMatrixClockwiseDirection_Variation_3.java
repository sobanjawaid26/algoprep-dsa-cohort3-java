package dsa_levelUp_recording.arrays._001_arrays5;

public class PrintSpiralNxMMatrixClockwiseDirection_Variation_3 {

    public static void printSpiralNxMMatrixClockwiseDirection_Variation_3(int mat[][]){
        int N = mat.length;
        int M = mat[0].length;
        int i = 0;
        int j = 0;
        int rowSteps = N - 1;
        int columnsSteps = M - 1;

        while(rowSteps >= 1 && columnsSteps >= 1){
            for(int k = 0; k < columnsSteps; k++){
                System.out.println(mat[i][j]);
                j++;
            }
            for(int k = 0; k < rowSteps; k++) {
                System.out.println(mat[i][j]);
                i++;
            }
            for(int k = 0; k < columnsSteps; k++) {
                System.out.println(mat[i][j]);
                j--;
            }
            for(int k = 0; k < rowSteps; k++) {
                System.out.println(mat[i][j]);
                i--;
            }
            i++;
            j++;
            rowSteps = rowSteps - 2;
            columnsSteps = columnsSteps - 2;
        }
        if (rowSteps == 0) {
            for (int k = 0; k < columnsSteps + 1; k++) {
                System.out.println(mat[i][j]);
                j++;
            }
        } else if(columnsSteps == 0){
            for(int k = 0; k < rowSteps; k++){
                System.out.println(mat[i][j]);
                i++;
            }
        }
    }
}
