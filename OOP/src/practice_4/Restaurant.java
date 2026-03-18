package practice_4;

public class Restaurant {
    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();

        if (eater instanceof Person person) {
            processPayment(person);
            return true;
        }

        System.out.println("No payment needed.");
        return false;
    }

    private void processPayment(Person person) {
        System.out.println("Processing payment for " + person.getName() + ".");
    }
}