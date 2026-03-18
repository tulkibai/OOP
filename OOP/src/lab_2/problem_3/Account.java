package lab_2.problem_3;

public class Account {
    private double balance;   // The current balance
    private int acNumber;     // The account number

    public Account (int acNumber_) {
        balance = 0.0;
        acNumber = acNumber_;
    }

    public void deposit (double sum) {
        if (sum <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += sum;
    }

    public void withdraw (double sum) {
        if (sum <= 0) {
            System.out.println("Withdraw amount must be positive.");
            return;
        }

        if (sum > balance) {
            System.out.println("Insufficient funds in account #" + acNumber);
            return;
        }

        balance -= sum;
    }

    public double getBalance () {
        return balance;
    }
    public int getAccountNumber () {
        return acNumber;
    }

    public void transfer (double amount, Account other) {
        if (other == null) {
            System.out.println("Target account does not exist.");
            return;
        }

        if (amount <= 0) {
            System.out.println("Transfer amount must be positive.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds for transfer from account #" + acNumber);
            return;
        }

        this.withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public String toString () {
        return "[Account: " + acNumber
                + ", balance: $" + String.format("%.2f", balance)
                + "]";
    }

    public final void print () {
        System.out.println(toString());
    }
}