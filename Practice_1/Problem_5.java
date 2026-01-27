void main() {
    Scanner in = new Scanner(System.in);
    double balance, interest;
    int period;
    IO.print("Enter the balance, interest and period (in years): \nbalance = ");
    balance = in.nextDouble();
    IO.print("interest (%) = ");
    interest = in.nextDouble();
    interest = interest / 100;
    IO.print("period = ");
    period = in.nextInt();
    IO.print("Balance after " + period + " years will be "
    + (balance * Math.pow((1 + interest), period)));
}
