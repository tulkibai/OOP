void main() {
    Scanner in = new Scanner(System.in);
    var name = "Adam";
    IO.print("Enter name: ");
    name = in.next();
    IO.print('+');
    for (int i = 0; i < name.length(); ++i) {
        IO.print('-');
    }
    IO.print("+\n|" + name + "|\n");
    IO.print('+');
    for (int i = 0; i < name.length(); ++i) {
        IO.print('-');
    }
    IO.print('+');
}
