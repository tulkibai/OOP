package lab_2.problem_5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    protected Animal pet;

    // если этот человек временно присматривает за чужим питомцем
    protected Person temporaryPetOwner;

    // если этот человек отдал своего питомца кому-то на время
    protected Person temporaryCaretaker;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.temporaryPetOwner = null;
        this.temporaryCaretaker = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    protected boolean canOwnPet(Animal pet) {
        return true;
    }

    public void assignPet(Animal pet) {
        if (pet == null) {
            System.out.println(name + " cannot be assigned a null pet.");
            return;
        }

        if (this.pet != null) {
            System.out.println(name + " already has a pet.");
            return;
        }

        if (!canOwnPet(pet)) {
            System.out.println(name + " is not allowed to own a " + pet.getClass().getSimpleName() + ".");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        if (pet == null) {
            System.out.println(name + " has no pet to remove.");
            return;
        }

        if (temporaryPetOwner != null) {
            System.out.println(name + " is only temporarily taking care of " + pet.getName() + " and cannot remove it permanently.");
            return;
        }

        pet = null;
    }

    public void leavePetWith(Person caretaker) {
        if (caretaker == null) {
            System.out.println("Caretaker is null.");
            return;
        }

        if (caretaker == this) {
            System.out.println(name + " cannot leave a pet with themselves.");
            return;
        }

        if (this.pet == null) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        if (this.temporaryCaretaker != null) {
            System.out.println(name + " has already left their pet with " + temporaryCaretaker.getName() + ".");
            return;
        }

        if (caretaker.pet != null) {
            System.out.println(caretaker.getName() + " already has a pet and cannot take another one.");
            return;
        }

        caretaker.receiveTemporaryPet(this.pet, this);
        this.pet = null;
        this.temporaryCaretaker = caretaker;
    }

    private void receiveTemporaryPet(Animal pet, Person owner) {
        this.pet = pet;
        this.temporaryPetOwner = owner;
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker == null) {
            System.out.println("Caretaker is null.");
            return;
        }

        if (this.temporaryCaretaker != caretaker) {
            System.out.println(name + " did not leave a pet with " + caretaker.getName() + ".");
            return;
        }

        if (caretaker.temporaryPetOwner != this) {
            System.out.println(caretaker.getName() + " is not taking care of " + name + "'s pet.");
            return;
        }

        if (caretaker.pet == null) {
            System.out.println(caretaker.getName() + " does not currently have the pet.");
            return;
        }

        this.pet = caretaker.pet;
        caretaker.pet = null;
        caretaker.temporaryPetOwner = null;
        this.temporaryCaretaker = null;
    }

    protected String petStatus() {
        if (pet != null && temporaryPetOwner != null) {
            return "temporarily caring for " + pet.getName() + " (owner: " + temporaryPetOwner.getName() + ")";
        }

        if (pet != null) {
            return "owns " + pet;
        }

        if (temporaryCaretaker != null) {
            return "pet is temporarily with " + temporaryCaretaker.getName();
        }

        return "no pet";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "[name: '" + name + "'" +
                ", age: " + age +
                ", occupation: '" + getOccupation() + "'" +
                ", petStatus: '" + petStatus() + "'" +
                "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), name, age);
    }
}
