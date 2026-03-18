package lab_2.problem_5;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student (" + researchTopic + ")";
    }

    @Override
    protected boolean canOwnPet(Animal pet) {
        return !(pet instanceof Dog);
    }
}
