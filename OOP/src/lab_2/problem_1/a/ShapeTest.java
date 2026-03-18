package lab_2.problem_1.a;

public class ShapeTest {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(3, 5);
        Sphere sphere = new Sphere(4);
        Cube cube = new Cube(2);

        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surface: " + cylinder.surfaceArea());

        System.out.println("Sphere volume: " + sphere.volume());
        System.out.println("Sphere surface: " + sphere.surfaceArea());

        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface: " + cube.surfaceArea());
    }
}