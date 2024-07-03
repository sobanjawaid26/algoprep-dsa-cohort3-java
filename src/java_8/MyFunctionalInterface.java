package java_8;

@FunctionalInterface
public interface MyFunctionalInterface {

    void myFunctionalInterfaceMethod(String str);

    static void myStaticMethod(String str){
        System.out.println("myStaticMethod : " + str);
    }
    default void myDefaultMethod(String str){
        System.out.println("myDefaultMethod : " + str);
    }
    static void myStaticMethod1(String str){
        System.out.println("myStaticMethod1 : " + str);
    }
    default void myDefaultMethod1(String str){
        System.out.println("myDefaultMethod1 : " + str);
    }
}
