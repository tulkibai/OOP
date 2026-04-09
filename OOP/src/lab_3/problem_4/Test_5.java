package lab_3.problem_4;

import java.time.LocalDate;

public class Test_5 {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate(50, "Twix"),
                new Chocolate(30, "Mars"),
                new Chocolate(70, "Snickers")
        };

        Sort.bubbleSort(chocolates);
        System.out.println("Chocolates:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Time[] times = {
                new Time(10, 30, 0),
                new Time(9, 45, 10),
                new Time(10, 15, 5)
        };

        Sort.selectionSort(times);
        System.out.println("\nTimes:");
        for (Time t : times) {
            System.out.println(t);
        }

        Employee[] employees = {
                new Employee("A", 25, 50000, LocalDate.of(2020, 1, 1), "111"),
                new Employee("B", 30, 40000, LocalDate.of(2021, 5, 10), "222"),
                new Employee("C", 28, 60000, LocalDate.of(2019, 3, 15), "333")
        };

        Sort.bubbleSort(employees);
        System.out.println("\nEmployees:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
