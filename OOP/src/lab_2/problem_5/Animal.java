package lab_2.problem_5;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal (String name_, int age_) {
        name = name_;
        age = age_;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public abstract String getSound ();

    @Override
    public String toString () {
        return getClass().getSimpleName() +
                "[name: '" + name + "'" +
                ", age: " + age +
                ", sound: '" + getSound() + "'" +
                "]";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), name, age);
    }


}