package dsa_live.arrays;

public class RotateArrayByK {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
//    after 3 rotation 7,8,9,1,2,3,4,5,6

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        rotateArrayByK(array, 3);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }

    public static void rotateArrayByK(int[] array, int k){
        reversePartOfArray(array, 0, array.length - 1);
        reversePartOfArray(array,0, k - 1);
        reversePartOfArray(array, k, array.length - 1);
    }

    public static void reversePartOfArray(int[] array, int start, int end){
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
