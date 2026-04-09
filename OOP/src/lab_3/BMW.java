package lab_3;

public class BMW extends Car implements Comparable<BMW> {
    public BMW(String model , int currentSpeed) {
        super(model, "fossil fuels", currentSpeed);
    }

    @Override
    public int compareTo(BMW o) {
        return Integer.compare(this.CurrentSpeed, o.CurrentSpeed);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "Model='" + Model + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", CurrentSpeed=" + CurrentSpeed +
                '}';
    }

    @Override
    public void Accelerate() {
        CurrentSpeed += 40;
    }

    public void Move() {
        System.out.println("BMW " + Model + " rides fast");
    }

    public void Drive(String driversName) {
        System.out.println(driversName + " drives BMW " + Model + " at speed " + CurrentSpeed);
    }

    public void Sound() {
        System.out.println("BMW " + Model + " sounds brrrrwwwwwmmmmm");
    }
}
