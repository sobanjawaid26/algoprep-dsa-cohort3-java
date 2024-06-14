package java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {

    public static void main(String[] args) {
        String[] arr = {"India", "Italy", "Malaysia", "Bangladesh", "Indonesia"};
        List<String> myList = Arrays.asList("India", "Italy", "Malaysia", "Bangladesh", "Indonesia");
        Stream<String> res1 = myList.stream()
                .filter(s -> s.startsWith("I"));
        System.out.println(res1);
        List<String> list1 = res1.collect(Collectors.toList());
        System.out.println(list1);

        Stream<String> res = Arrays.stream(arr)
                .filter(s -> s.startsWith("I"));
        System.out.println(res);
        List<String> list = res.collect(Collectors.toList());
        System.out.println(list);
    }
}
