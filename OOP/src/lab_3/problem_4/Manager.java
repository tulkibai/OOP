package lab_3.problem_4;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    protected Vector<Employee> Subordinates = new Vector<Employee>();
    protected double Bonus;

    public Manager(String name, int age, double salary, LocalDate hireDate, String insuranceNumber, Vector<Employee> subordinates, Double bonus) {
        super(name, age, salary, hireDate, insuranceNumber);
        Subordinates = subordinates;
        Bonus = bonus;
    }

    public boolean AddSubOrdinate(Employee subOrdinate) {
        return Subordinates.add(subOrdinate);
    }

    public void addBonus (double bonus) {
        Bonus += bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public Vector<Employee> getSubordinates() {
        return Subordinates;
    }

    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();

        if (this.Subordinates != null) {
            cloned.Subordinates = (Vector<Employee>) this.Subordinates.clone();
        }

        return cloned;
    }

    @Override
    public int compareTo(Employee o) {
        int salaryCompare = Double.compare(this.Salary, o.Salary);

        if (salaryCompare != 0) {
            return salaryCompare;
        }

        double b2 = (o instanceof Manager m) ? m.Bonus : 0;
        return Double.compare(this.Bonus, b2);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Bonus=" + Bonus +
                ", Salary=" + Salary +
                ", HireDate=" + HireDate +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Manager manager)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(Bonus, manager.Bonus) == 0 && Objects.equals(Subordinates, manager.Subordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Subordinates, Bonus);
    }
}
