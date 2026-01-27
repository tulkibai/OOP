void main() {
    Scanner in = new Scanner(System.in);
    int a, b, c;
    IO.print("Enter parameters of the equation: \na = ");
    a = in.nextInt();
    IO.print("b = ");
    b = in.nextInt();
    IO.print("c = ");
    c = in.nextInt();
    double root1, root2;
    double disc = b * b - 4 * a * c;
    if (disc < 0) IO.print("There is no roots");
    else if (disc == 0) IO.print("Root is " + (-b / (2 * a)));
    else IO.print("Root_1 is " + (-b + Math.sqrt(disc)) / (2 * a)
    + "\nRoot_2 is " + (-b - Math.sqrt(disc)) / (2 * a));
}
