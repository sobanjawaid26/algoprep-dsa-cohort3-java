package dsa_foundation_live.strings;

public class Characters1 {

    public static void main(String[] args) {
        char ch1 = 'B';
        System.out.println((int) ch1);
        System.out.println(ch1);
        System.out.println("--------------------------------------");

        int x = 'A';
        x = x + 2;
        System.out.println(x);
        System.out.println("--------------------------------------");

        //char ch3 = 'xyz'; // ERROR

        System.out.println("--------------------------------------");
        char ch4 = 66;
        System.out.println(ch4);
        char ch5 = (char) 66;
        System.out.println(ch5); // SAME RESULT

        System.out.println("--------------------------------------");

    }
}
