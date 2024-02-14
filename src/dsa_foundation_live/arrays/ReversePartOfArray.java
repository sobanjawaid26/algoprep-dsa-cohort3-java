package dsa_foundation_live.arrays;

public class ReversePartOfArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        //             0,1,2,3,4,5,6,7,8

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
        reversePartOfArray(array, 2,6);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }

    public static void reversePartOfArray(int[] array, int start, int end){

        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

}
