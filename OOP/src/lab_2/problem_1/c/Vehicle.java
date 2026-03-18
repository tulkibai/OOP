package lab_2.problem_1.c;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private String model;
    private int manufactureYear;

    public Vehicle (String brand_, String model_, int manufactureYear_) {
        this.brand = brand_;
        this.model = model_;
        this.manufactureYear = manufactureYear_;
    }

    public String getBrand () {
        return brand;
    }
    public String getModel () {
        return model;
    }
    public int getManufactureYear () {
        return manufactureYear;
    }

    @Override
    public String toString () {
        return "[brand: " + brand +
                ", model: " + model +
                ", manufacture year: " + manufactureYear +
                "]";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle other = (Vehicle) o;

        return Objects.equals(brand, other.brand) &&
                Objects.equals(model, other.model) &&
                manufactureYear == other.manufactureYear;
    }

    @Override
    public int hashCode () {
        return Objects.hash(brand, model, manufactureYear);
    }
}