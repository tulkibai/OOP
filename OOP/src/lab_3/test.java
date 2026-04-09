package lab_3;

public class test {
    public static void main (String[] args) {
        BMW x5 = new BMW("X5", 120);
        Tesla s = new Tesla("S", 100);
        Parrot kesha = new Parrot("Kesha", "Cacatuidae", 4);

        System.out.println("BMW X5 speed before: " + x5.getCurrentSpeed());
        x5.Accelerate();
        System.out.println("BMW X5 speed after: " + x5.getCurrentSpeed());

        System.out.println("__________________________________________");

        System.out.println("Tesla S speed before: " + s.getCurrentSpeed());
        s.Accelerate();
        System.out.println("Tesla S speed after: " + s.getCurrentSpeed());

        System.out.println("__________________________________________");

        x5.Sound();
        s.Sound();
        kesha.Sound();

        System.out.println("__________________________________________");

        x5.Move();
        s.Move();
        kesha.Move();

        System.out.println("__________________________________________");

        x5.Drive("Schumi");
        s.Drive("Schumi");
        kesha.Fly();
    }
}
