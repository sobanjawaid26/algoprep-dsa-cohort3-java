package java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams2 {

    public static void main(String[] args) {
        List<String> lisOfString = Arrays.asList("Java", "Spring", "Java"); // ["Java"]
        Set<String> origList = lisOfString.stream().filter(i -> Collections.frequency(lisOfString, i) >1)
                .collect(Collectors.toSet());

        System.out.println(origList);

        List<String> sortedList_0 = lisOfString.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedList = lisOfString.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());

        System.out.println(sortedList);

        String name = "sobanjawaid";
        Map<String, Long> collect = Arrays.stream(name.split(""))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        System.out.println(collect);

        List<Employee> listOfEmployees = EmployeeFactory.getAllEmployees();
        Map<String, Long> empCountByDept = listOfEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(empCountByDept);

        Map<String, Optional<Employee>> empMaxSalByDept = listOfEmployees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, Collectors.maxBy(
                                Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(empMaxSalByDept);
    }
}
