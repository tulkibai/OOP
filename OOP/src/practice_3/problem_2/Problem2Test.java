package practice_3.problem_2;

import java.util.Scanner;
import java.util.Vector;

public class Problem2Test {
    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Add person");
            System.out.println("2) Print all");
            System.out.println("0) Exit");
            System.out.print("> ");
            String choice = sc.nextLine();

            if ("0".equals(choice)) {
                break;
            } else if ("2".equals(choice)) {
                for (Person p : people) {
                    System.out.println(p);
                }
            } else if ("1".equals(choice)) {
                System.out.println("Type: 1-Person, 2-Student, 3-Staff");
                System.out.print("> ");
                String type = sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Address: ");
                String address = sc.nextLine();

                if ("1".equals(type)) {
                    people.add(new Person(name, address));
                } else if ("2".equals(type)) {
                    System.out.print("Program: ");
                    String program = sc.nextLine();
                    System.out.print("Year: ");
                    int year = Integer.parseInt(sc.nextLine());
                    System.out.print("Fee: ");
                    double fee = Double.parseDouble(sc.nextLine());
                    people.add(new Student(name, address, program, year, fee));
                } else if ("3".equals(type)) {
                    System.out.print("School: ");
                    String school = sc.nextLine();
                    System.out.print("Pay: ");
                    double pay = Double.parseDouble(sc.nextLine());
                    people.add(new Staff(name, address, school, pay));
                } else {
                    System.out.println("Unknown type");
                }
            } else {
                System.out.println("Wrong option");
            }
        }
    }
}

