package practice_4;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
