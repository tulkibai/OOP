package lab_2.problem_4;

public abstract class Circuit {
    public abstract double getResistance ();
    public abstract double getPotentialDiff ();
    public abstract void applyPotentialDiff (double v);

    public double getPower () {
        return getPotentialDiff() * getCurrent();
    }

    public double getCurrent () {
        double resistance = getResistance();
        if (resistance == 0) {
            return 0;
        }
        return getPotentialDiff() / resistance;
    }
}
