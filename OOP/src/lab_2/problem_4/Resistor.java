package lab_2.problem_4;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;

    public Resistor (double resistance_) {
        resistance = resistance_;
        potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff () {
        return potentialDifference;
    }

    public void setPotentialDiff (double potentialDifference) {
        this.potentialDifference = potentialDifference;
    }

    @Override
    public void applyPotentialDiff (double v) {
        setPotentialDiff(v);
    }

    @Override
    public String toString () {
        return "[R = " + resistance +
                ", V = " + potentialDifference +
                ", I = " + getCurrent() +
                ", P = " + getPower() + "]";
    }
}
