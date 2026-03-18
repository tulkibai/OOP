package lab_2.problem_3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank () {
        accounts = new Vector<>();
    }

    public void openAccount (Account account) {
        if (account == null) {
            System.out.println("Cannot open a null account.");
            return;
        }
        accounts.add(account);
    }

    public boolean closeAccount (int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }

    public Account findAccount (int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void update () {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public void printAllAccounts () {
        for (Account account : accounts) {
            account.print();
        }
    }
}