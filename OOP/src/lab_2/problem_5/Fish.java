package lab_2.problem_5;

import java.util.Objects;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Blub";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), getName(), getAge());
    }
}
