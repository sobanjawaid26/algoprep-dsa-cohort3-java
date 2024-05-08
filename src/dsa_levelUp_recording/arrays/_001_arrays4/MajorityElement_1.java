package dsa_levelUp_recording.arrays._001_arrays4;

public class MajorityElement_1 {

    /*
        if we cancel out 1 majority element no with
        1 non majority element number the non cancelled
        number at the end is going to be majorityelem

        you don't need to know majority element
        you cancel out
        3ggtg IImen
        Summary Cancel out 2 distinct elements one by
        one the uncancelled element is going to
        be majority element
     */
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
