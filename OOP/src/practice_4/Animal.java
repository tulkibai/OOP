package practice_4;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void breathe() {
        System.out.println(name + " is breathing.");
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}