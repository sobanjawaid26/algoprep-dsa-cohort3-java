package design_patterns.factory_design_pattern;

public class FactoryMain {

    public static void main(String[] args) {
        OperatingSystemFactory obj = new OperatingSystemFactory();
        OS os = obj.getInstance("s");
        os.specs();
    }
}
