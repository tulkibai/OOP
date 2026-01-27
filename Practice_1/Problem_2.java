void main() {
    Scanner in = new Scanner(System.in);
    double area = 12;
    double perimeter = 12;
    double diagonal = 12;
    double a = 12;
    IO.print("Enter length of the side of a square: ");
    a = in.nextDouble();
    area = a * a;
    perimeter = 4 * a;
    diagonal = a * Math.sqrt(2);
    IO.print("The area = " + area + " \nThe perimeter = " + perimeter +
            "\nThe diagonal = " + diagonal);
}
