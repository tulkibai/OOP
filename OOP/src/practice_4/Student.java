package practice_4;

public class Student extends Person
        implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable, Comparable<Student> {
    private double gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " is eating pizza.");
    }

    @Override
    public void takeRetake(String subject) {
        System.out.println(name + " is taking a retake in " + subject + ".");
    }

    @Override
    public void dance() {
        System.out.println(name + " is dancing at the party.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving to the next class.");
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}
