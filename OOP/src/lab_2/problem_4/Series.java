package lab_2.problem_4;

public class Series extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Series (Circuit first_, Circuit second_) {
        first = first_;
        second = second_;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance () {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff () {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff (double v) {
        potentialDifference = v;

        double totalResistance = getResistance();
        if (totalResistance == 0) {
            first.applyPotentialDiff(0);
            second.applyPotentialDiff(0);
            return;
        }

        double current = v / totalResistance;

        double v1 = current * first.getResistance();
        double v2 = current * second.getResistance();

        first.applyPotentialDiff(v1);
        second.applyPotentialDiff(v2);
    }

    @Override
    public String toString () {
        return "[R = " + getResistance() +
                ", V = " + getPotentialDiff() +
                ", I = " + getCurrent() +
                ", P = " + getPower() + "]";
    }
}
