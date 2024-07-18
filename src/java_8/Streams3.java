package java_8;

import core_java_concepts.comparable_comparator.Student;

import java.util.List;
import java.util.function.Consumer;

public class Streams3 {

    public static void main(String[] args) {
        List<Employee> listOfEmployees = EmployeeFactory.getAllEmployees();

        Consumer<String> printConsumer= new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        };
        listOfEmployees.forEach(System.out::println);
    }
}
