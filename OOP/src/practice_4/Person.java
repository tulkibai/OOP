package practice_4;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void breathe() {
        System.out.println(name + " is breathing.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
