package practice_4;

public class Cat extends Animal implements CanHavePizza, Movable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving gracefully.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow");
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "'}";
    }
}