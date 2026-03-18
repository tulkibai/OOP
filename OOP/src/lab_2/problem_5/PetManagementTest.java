package lab_2.problem_5;

public class PetManagementTest {
    public static void main (String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 20, "Math");

        Animal rex = new Dog("Rex", 5);
        Animal murka = new Cat("Murka", 3);
        Animal goldie = new Fish("Goldie", 1);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        // John gets a dog
        john.assignPet(rex);

        // Alice is not allowed to own a dog
        alice.assignPet(new Dog("Spike", 2));

        // Bob gets a fish
        bob.assignPet(goldie);

        System.out.println("=== Initial registry ===");
        System.out.println(registry);

        // John leaves Rex with Alice during vacation
        john.leavePetWith(alice);

        System.out.println("=== After John leaves Rex with Alice ===");
        System.out.println(registry);

        // John returns and takes Rex back
        john.retrievePetFrom(alice);

        System.out.println("=== After John retrieves Rex ===");
        System.out.println(registry);

        // Extra: Alice can own a cat
        alice.assignPet(murka);

        System.out.println("=== After Alice gets Murka ===");
        System.out.println(registry);

        System.out.println("=== People with pets ===");
        for (Person p : registry.findPeopleWithPets()) {
            System.out.println(p.getName());
        }

        System.out.println("=== People without pets ===");
        for (Person p : registry.findPeopleWithoutPets()) {
            System.out.println(p.getName());
        }
    }
}
