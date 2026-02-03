void main() {
    Scanner in = new Scanner(System.in);
    int area, perimeter, a;
    double diagonal;
    IO.print("Enter length of side of square: ");
    a = in.nextInt();
    area = a * a;
    perimeter = 4 * a;
    diagonal = a * Math.sqrt(2);
    IO.print("The area = " + area + " \nThe perimeter = " + perimeter +
            "\nThe diagonal = " + diagonal);
}