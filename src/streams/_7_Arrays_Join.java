package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class _7_Arrays_Join {

    public static void main(String[] args) {

        List<String> nos = Arrays.asList("1","2", "3", "4");

        String results = String.join("-", nos);
        System.out.println(results);

        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::print);
    }
}
