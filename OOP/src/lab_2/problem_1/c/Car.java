package lab_2.problem_1.c;

import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfDoors;
    private double trunkCapacity;

    public Car (String brand_, String model_, int manufactureYear_, int numberOfDoors_, double trunkCapacity_) {
        super(brand_, model_, manufactureYear_);
        this.numberOfDoors = numberOfDoors_;
        this.trunkCapacity = trunkCapacity_;
    }

    public int getNumberOfDoors () {
        return numberOfDoors;
    }
    public double getTrunkCapacity () {
        return trunkCapacity;
    }

    @Override
    public String toString () {
        return "[brand: " + getBrand() +
                ", model: " + getModel() +
                ", manufacture year: " + getManufactureYear() +
                ", number of doors: " + numberOfDoors +
                ", trunk capacity: " + trunkCapacity +
                "]";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Car other = (Car) o;

        return numberOfDoors == other.numberOfDoors &&
                Double.compare(other.trunkCapacity, trunkCapacity) == 0;
    }

    @Override
    public int hashCode () {
        return Objects.hash(super.hashCode(), numberOfDoors, trunkCapacity);
    }
}
