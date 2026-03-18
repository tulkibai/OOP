package lab_2.problem_5;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Woof";
    }
}
