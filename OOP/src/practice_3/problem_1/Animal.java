package practice_3.problem_1;

public class Animal {
    protected String name;

    public Animal() {
        this("Unnamed");
    }

    public Animal(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(name + ": no voice");
    }

    public void eat() {
        System.out.println(name + " eats something");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }
}

