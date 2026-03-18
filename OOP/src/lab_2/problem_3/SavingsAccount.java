package lab_2.problem_3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount (int acNumber, double interestRate) {
        super(acNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate (double interestRate) {
        if (interestRate < 0) {
            System.out.println("Interest rate cannot be negative.");
            return;
        }
        this.interestRate = interestRate;
    }

    public void addInterest () {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    @Override
    public String toString () {
        return "[SavingsAccount: " + getAccountNumber()
                + ", balance: $" + String.format("%.2f", getBalance())
                + ", interest rate: " + String.format("%.2f", interestRate) + "%"
                + "]";
    }
}
