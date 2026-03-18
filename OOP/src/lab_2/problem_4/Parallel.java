package lab_2.problem_4;

public class Parallel extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Parallel (Circuit first_, Circuit second_) {
        first = first_;
        second = second_;
        potentialDifference = 0.0;
    }

    @Override
    public double getResistance () {
        double r1 = first.getResistance();
        double r2 = second.getResistance();

        if (r1 == 0 || r2 == 0) {
            return 0;
        }

        return 1.0 / (1.0 / r1 + 1.0 / r2);
    }

    @Override
    public double getPotentialDiff () {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff (double v) {
        potentialDifference = v;

        first.applyPotentialDiff(v);
        second.applyPotentialDiff(v);
    }

    @Override
    public String toString () {
        return "[R = " + getResistance() +
                ", V = " + getPotentialDiff() +
                ", I = " + getCurrent() +
                ", P = " + getPower() +
                "]";
    }
}
