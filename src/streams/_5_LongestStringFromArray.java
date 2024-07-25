package streams;

import java.util.Arrays;

public class _5_LongestStringFromArray {

    public static void main(String[] args) {

        String arr[] = {"java", "techie", "springboot", "microservices"};

        String longestString =
        Arrays.stream(arr)
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .get();
        System.out.println("longestString : " + longestString);
    }
}
