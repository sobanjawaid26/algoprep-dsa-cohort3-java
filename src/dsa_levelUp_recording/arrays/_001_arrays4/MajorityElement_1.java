package dsa_levelUp_recording.arrays._001_arrays4;

public class MajorityElement_1 {

    public static int findMajorityElement_1(int[] arr){
        int val = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++){
            if(arr[i] == val){
                count++;
            } else{
                if(count == 0){
                    val = arr[i];
                    count = 1;
                } else {
                    count--;
                }
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 8, 4, 9, 4, 3, 4};
        int res = findMajorityElement_1(arr);
        System.out.println(res);
    }
}
