package practice_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant delPapa = new Restaurant();

        Cat cat = new Cat("Barsik");
        Student s1 = new Student("Alina", 19, 3.7);
        Student s2 = new Student("Miras", 20, 3.9);
        Student s3 = new Student("Daulet", 18, 3.5);

        System.out.println("=== Pizza test ===");
        delPapa.servePizza(cat);
        delPapa.servePizza(s1);

        System.out.println("\n=== Interface behavior test ===");
        cat.move();
        cat.makeSound();

        s1.move();
        s1.dance();
        s1.takeRetake("OOP");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("\n=== Before sorting ===");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("\n=== Sorted by GPA (Comparable) ===");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new NameComparator());
        System.out.println("\n=== Sorted by name (Comparator) ===");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
