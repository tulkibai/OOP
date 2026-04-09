package lab_3.problem_4;

import java.util.*;
import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        try {
            Vector<Employee> team = new Vector<>();
            team.add(new Employee("Ivan", 25, 1000.0, LocalDate.of(2022, 1, 1), "INS-001"));
            team.add(new Employee("Dmitry", 30, 1100.0, LocalDate.of(2021, 5, 12), "INS-002"));

            Manager boss = new Manager(
                    "Oleg", 40, 5000.0, LocalDate.of(2015, 10, 10),
                    "INS-BOSS-777", team, 1500.0
            );

            Employee regular = new Employee(
                    "Anna", 28, 2000.0, LocalDate.of(2023, 3, 15), "INS-003"
            );

            List<Employee> staff = new ArrayList<>();
            staff.add(boss);
            staff.add(regular);

            staff.add(new Manager("Elena", 35, 5000.0, LocalDate.of(2018, 1, 1), "INS-004", new Vector<>(), 500.0));

            System.out.println("--- Список до сортировки ---");
            staff.forEach(System.out::println);

            Collections.sort(staff);
            System.out.println("\n--- После сортировки (Salary + Bonus) ---");
            staff.forEach(System.out::println);

            System.out.println("\n--- Тест клонирования менеджера ---");
            Manager clonedBoss = boss.clone();

            System.out.println("Оригинал: " + boss.getName() + " (Bonus: " + boss.getBonus() + ")");
            System.out.println("Клон:     " + clonedBoss.getName() + " (Bonus: " + clonedBoss.getBonus() + ")");

            clonedBoss.setSalary(9999.0);
            System.out.println("\nИзменили зарплату клону до 9999.0");
            System.out.println("Зарплата оригинала: " + boss.getSalary());
            System.out.println("Зарплата клона:     " + clonedBoss.getSalary());

            System.out.println("\n--- Проверка списка подчиненных ---");
            System.out.println("Одинаковые ли списки в памяти? " + (boss.getSubordinates() == clonedBoss.getSubordinates()));

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}