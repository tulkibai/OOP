package lab_3.problem_4;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    protected String Name;
    protected int Age;

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Age == person.Age && Objects.equals(Name, person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age);
    }
}
