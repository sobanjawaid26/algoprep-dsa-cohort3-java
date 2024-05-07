package dsa_levelUp_recording.arrays._001_arrays4;

public class FirstMissingNaturalNumber {

    /*
        in - [3,-2,1,2,7],            out - 4
        in - [-8, 2, 6, 4, -7,1,3]    out - 5
     */
    public static void main(String[] args) {
        int arr1[] = {3,-2,1,2,7};
        int res1 = firstMissingNaturalNumber(arr1);
        System.out.println(res1);

        int arr2[] = {-8, 2, 6, 4, -7,1,3};
        int res2 = firstMissingNaturalNumber(arr2);
        System.out.println(res2);
    }

    public static int firstMissingNaturalNumber(int[] arr){
        int N = arr.length;
        int i = 0;
        while (i < N) {
            if(arr[i] < 1 || arr[i] > N || i == arr[i] - 1){
                i++;
            } else {
                int idx = arr[i] - 1;
                if(arr[i] == arr[idx])
                    i++;
                else {
                    // swap(arr[i], arr[idx]);
                    int temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                }
            }
        }

        for (int j = 0; j < N;j++){
            //System.out.print(arr[j]);
            if(j != arr[j] - 1)
                return j + 1;
        }
        return N + 1;

    }
}
