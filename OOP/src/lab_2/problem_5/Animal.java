package lab_2.problem_5;

import java.util.Objects;
import lab_3.*;

public abstract class Animal implements Comparable<Animal>, Cloneable, ISoundable, IMoveable {
    private String name;
    private int age;

    @Override
    public void Sound() {
        System.out.println("Animal " + name + " make some sound");
    }

    @Override
    public void Move() {
        System.out.println("Animal " + name + " walks");
    }

    public Animal (String name_, int age_) {
        name = name_;
        age = age_;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.age);
    }

    @Override
    public Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
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