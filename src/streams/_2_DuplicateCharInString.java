package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _2_DuplicateCharInString {

    public static void main(String[] args) {

        String input = "ilovejavatechie";

        List<String> duplicateCharInString =
        Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(k -> k.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("duplicateCharInString : " + duplicateCharInString);

        List<String> uniqueElements =
                Arrays.stream(input.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter(k -> k.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());

        System.out.println("uniqueElements : " + uniqueElements);
    }
}
