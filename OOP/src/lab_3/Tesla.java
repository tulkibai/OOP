package lab_3;

public class Tesla extends Car {
    public Tesla(String model, int currentSpeed) {
        super(model, "electricity", currentSpeed);
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "Model='" + Model + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", CurrentSpeed=" + CurrentSpeed +
                '}';
    }

    @Override
    public void Accelerate() {
        CurrentSpeed += 30;
    }

    public void Move() {
        System.out.println("Tesla " + Model + " rides noiselessly");
    }

    public void Drive(String driversName) {
        System.out.println(driversName + " drives Tesla " + Model + " at speed " + CurrentSpeed);
    }

    public void Sound() {
        System.out.println("Tesla " + Model + " sounds vzzhhhhhhhhhh");
    }
}
