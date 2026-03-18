package lab_2.problem_3;

public class BankTest {
    public static void main (String[] args) {
        Bank bank = new Bank();

        // Create accounts
        Account a1 = new Account(1001);
        SavingsAccount s1 = new SavingsAccount(2001, 5.0);
        SavingsAccount s2 = new SavingsAccount(2002, 3.5);
        CheckingAccount c1 = new CheckingAccount(3001);
        CheckingAccount c2 = new CheckingAccount(3002);

        // Open accounts
        bank.openAccount(a1);
        bank.openAccount(s1);
        bank.openAccount(s2);
        bank.openAccount(c1);
        bank.openAccount(c2);

        // Basic operations
        a1.deposit(500);
        a1.withdraw(100);

        s1.deposit(1000);
        s2.deposit(2000);

        c1.deposit(300);
        c1.deposit(100);
        c1.withdraw(50);
        c1.withdraw(25);
        c1.deposit(75); // transactions > FREE_TRANSACTIONS

        c2.deposit(1000);
        c2.withdraw(200);

        // Transfer
        a1.transfer(50, s1);

        System.out.println("Before update");
        bank.printAllAccounts();

        // Apply monthly/yearly bank update logic
        bank.update();

        System.out.println("\nAfter update");
        bank.printAllAccounts();

        // Close one account
        boolean removed = bank.closeAccount(2002);
        System.out.println("\nClosing account 2002: " + (removed ? "success" : "failed"));

        System.out.println("\nAfter closing one account");
        bank.printAllAccounts();
    }
}
