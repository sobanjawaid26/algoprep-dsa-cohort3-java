package java_8.method_reference;

public class Main1 {

    public static void main(String[] args) {
        StringOperation1 stringOperation1 = s -> System.out.println(s);
        StringOperation1 stringOperation11 = System.out::println;
        stringOperation1.accept("soban");
        stringOperation11.accept("soban");
        System.out.println("-------------------------------------------");

        StringOperation2 stringOperation2 = s -> s.startsWith("s");

        boolean res1 = stringOperation2.accept("soban");
        boolean res2 = stringOperation2.accept("jawaid");
        System.out.println(res1);
        System.out.println(res2);

        System.out.println("-------------------------------------------------");
        StringOperation3 stringOperation3 = (s) -> s.toUpperCase();
        StringOperation3 stringOperation31 = String::toUpperCase;
        System.out.println(stringOperation3.accept("soban"));
        System.out.println(stringOperation31.accept("soban"));
    }
}
