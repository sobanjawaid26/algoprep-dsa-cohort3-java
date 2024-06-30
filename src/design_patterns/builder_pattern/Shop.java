package design_patterns.builder_pattern;

public class Shop {

    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOs("android")
                .setProcessor("m1")
                .setBattery(3000)
                .setRam(2)
                .setScreenSize(5)
                .getPhone();
        System.out.println(phone);
    }
}
