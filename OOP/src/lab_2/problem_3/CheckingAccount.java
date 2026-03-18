package lab_2.problem_3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount (int acNumber) {
        super(acNumber);
        transactionCount = 0;
    }

    @Override
    public void deposit (double sum) {
        double oldBalance = getBalance();
        super.deposit(sum);

        if (getBalance() > oldBalance) {
            transactionCount++;
        }
    }

    @Override
    public void withdraw (double sum) {
        double oldBalance = getBalance();
        super.withdraw(sum);

        if (getBalance() < oldBalance) {
            transactionCount++;
        }
    }

    public void deductFee () {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double fee = extraTransactions * TRANSACTION_FEE;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    public int getTransactionCount () {
        return transactionCount;
    }

    @Override
    public String toString () {
        return "[CheckingAccount: " + getAccountNumber()
                + ", balance: $" + String.format("%.2f", getBalance())
                + ", transactions: " + transactionCount
                + "]";
    }
}
