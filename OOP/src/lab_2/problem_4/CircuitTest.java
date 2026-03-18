package lab_2.problem_4;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        double R = circuit.getResistance();
        System.out.println("Equivalent resistance: " + R);

        double V = 12.0;
        circuit.applyPotentialDiff(V);

        System.out.println("\nWhole circuit:");
        System.out.println("Voltage = " + circuit.getPotentialDiff());
        System.out.println("Current = " + circuit.getCurrent());
        System.out.println("Power = " + circuit.getPower());

        System.out.println("\nIndividual parts:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
        System.out.println("f: " + f);
        System.out.println("g: " + g);
        System.out.println("h: " + h);
    }
}
