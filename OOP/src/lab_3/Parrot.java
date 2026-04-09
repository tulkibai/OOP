package lab_3;

public class Parrot implements ISoundable, IFlyable{
    protected String Name;
    protected String Type;
    protected int Age;

    public Parrot(String name, String type, int age) {
        Name = name;
        Type = type;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }

    public int getAge() {
        return Age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                ", Type='" + Type + '\'' +
                ", Age=" + Age +
                '}';
    }

    public void Move() {
        System.out.println("Parrot " + Name + " walks");
    }

    public void Fly() {
        System.out.println("Parrot " + Name + " flies");
    }

    public void Sound() {
        System.out.println("Parrot " + Name + " sounds " + Name + " " + Name);
    }
}
