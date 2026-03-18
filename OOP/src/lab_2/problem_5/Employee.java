package lab_2.problem_5;

public class Employee extends Person {
    private String jobTitle;

    public Employee(String name, int age, String jobTitle_) {
        super(name, age);
        jobTitle = jobTitle_;
    }
    
    @Override
    public String getOccupation() {
        return "[Employee: " + jobTitle + "]";
    }
}
