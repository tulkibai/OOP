package practice_3.problem_1;

public class Problem1Test {
    public static void main(String[] args) {
        Animal a = new Animal("Animal");
        Animal c = new Cat("Barsik");

        a.voice();
        c.voice();

        a.eat();
        a.eat("fish");
        c.eat("fish");

        Cat realCat = new Cat();
        realCat.eat("meat");
        realCat.eat(100);
    }
}