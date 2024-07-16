package core_java_concepts.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    @Override
    public int compareTo(Student s) {
        if(id == s.id)
            return 0;
        else if(id > s.id)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(101, "Soban");
        Student s2 = new Student(103, "Jawaid");
        Student s3 = new Student(102, "Sufian");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println("Before Comparable Sorting : " + studentList);
        //Collections.sort(studentList);
        System.out.println("After Comparable Sorting : " + studentList);

        System.out.println("Comparison using comparator --------------------------------------------------");
        Collections.sort(studentList, new NameComparator());
        System.out.println("After Comparator Sorting : " + studentList);
    }
}
