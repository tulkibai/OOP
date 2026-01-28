void main() {
    Scanner in = new Scanner(System.in);
    var name = "Adam";
    IO.print("Enter name: ");
    name = in.next();
    IO.print('+');
    IO.print("-".repeat(name.length()));
    IO.print("+\n|" + name + "|\n");
    IO.print('+');
    IO.print("-".repeat(name.length()));
    IO.print('+');
}