package dsa_live.arrays;

public class CountGreaterThanItself {

    static int countGreater(int arr[], int N) {
        int max = arr[0];

        for (int i = 0; i < N; i++){
            if(arr[i] > max)
                max = arr[i];
        }

        int maxCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] ==  max)
                maxCount++;
        }
        return N - maxCount;
    }
}
