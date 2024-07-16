package core_java_concepts.comparable_comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
