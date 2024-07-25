package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _4_SecondHighestNumberFromArray {

    public static void main(String[] args) {

        int[] arr = {5,9,11,2,8,21,1};
        Integer secondHighestNumber =
        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();


        System.out.println(secondHighestNumber);
    }
}
