package lab_3;

public abstract class Car implements ISoundable, IDriveable{
    protected String Model;
    protected String FuelType;
    protected int CurrentSpeed;

    public Car(String model, String fuelType, int currentSpeed) {
        Model = model;
        FuelType = fuelType;
        CurrentSpeed = currentSpeed;
    }

    public String getModel() {
        return Model;
    }

    public String getFuelType() {
        return FuelType;
    }

    public int getCurrentSpeed() {
        return CurrentSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Model='" + Model + '\'' +
                ", FuelType='" + FuelType + '\'' +
                ", CurrentSpeed=" + CurrentSpeed +
                '}';
    }

    public void ShowSpeed() {
        System.out.println("Current speed is: " + CurrentSpeed);
    }

    public abstract void Accelerate();
}