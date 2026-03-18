package lab_2.problem_5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry () {
        people = new ArrayList<>();
    }

    public void addPerson (Person person) {
        if (person == null) {
            System.out.println("Cannot add null person.");
            return;
        }

        if (people.contains(person)) {
            System.out.println(person.getName() + " is already in registry.");
            return;
        }

        people.add(person);
    }

    public void removePerson (Person person) {
        if (!people.remove(person)) {
            System.out.println("Person not found in registry.");
        }
    }

    public List<Person> findPeopleWithPets () {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeopleWithoutPets () {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (!person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public Person findByName (String name) {
        for (Person person : people) {
            if (person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public String toString () {
        String sb = "Person Registry:\n";
        for (Person person : people) {
            sb += person.toString();
            sb += '\n';
        }
        return sb;
    }
}
