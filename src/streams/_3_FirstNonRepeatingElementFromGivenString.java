package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _3_FirstNonRepeatingElementFromGivenString {

    public static void main(String[] args) {

        String input = "ilovejavatechie";

        String wrongFirstNonRepeatingElement =
                Arrays.stream(input.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream()
                        .filter(s -> s.getValue() == 1)
                        .findFirst().get().getKey();

        System.out.println("wrongFirstNonRepeatingElement : "+ wrongFirstNonRepeatingElement);

        String firstNonRepeatingElement =
                Arrays.stream(input.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter(s -> s.getValue() == 1)
                        .findFirst().get().getKey();

        System.out.println("firstNonRepeatingElement : "+ firstNonRepeatingElement);
    }
}
