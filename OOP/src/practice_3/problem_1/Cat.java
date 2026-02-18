package practice_3.problem_1;

public class Cat extends Animal {

    public Cat() {
        super();
        this.name = "DefaultCat";
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(name + ": meow");
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println(name + " is happy");
    }

    public void eat(int grams) {
        System.out.println(name + " eats " + grams + " grams");
    }
}
