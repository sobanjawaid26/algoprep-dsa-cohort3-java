package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _6_ElementsStartingWith_1 {

    public static void main(String[] args) {

        int[] arr = {5,9,11,2,8,21,1};

        List<Integer> elementsStartingWith1 =
        Arrays.stream(arr).boxed()
                .map(i -> i+"")
                .filter(s -> s.startsWith("1"))
                .map(s-> Integer.parseInt(s))
                .collect(Collectors.toList());

        System.out.println(elementsStartingWith1);
    }
}
