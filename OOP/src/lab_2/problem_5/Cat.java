package lab_2.problem_5;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Meow";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return super.equals(o);
    }
}
