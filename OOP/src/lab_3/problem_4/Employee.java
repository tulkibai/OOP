package lab_3.problem_4;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double Salary;
    protected LocalDate HireDate;
    protected String insuranceNumber;

    public Employee(String name, int age, double salary, LocalDate hireDate, String insuranceNumber) {
        super(name, age);
        Salary = salary;
        HireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public LocalDate getHireDate() {
        return HireDate;
    }

    public double getSalary() {
        return Salary;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.Salary, o.Salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Salary=" + Salary +
                ", HireDate=" + HireDate +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (!super.equals(o)) return false;
        return Double.compare(Salary, employee.Salary) == 0
                && Objects.equals(HireDate, employee.HireDate)
                && Objects.equals(insuranceNumber, employee.insuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Salary, HireDate, insuranceNumber);
    }
}
