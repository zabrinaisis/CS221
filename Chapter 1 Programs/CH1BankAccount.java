package fixcode;

/**
 *  Creates a bank account object and uses methods to change.
 *  Constructor requiring an opening balance.
 *  Method to deposit.
 *  Method to withdraw.
 *  Method to show the balance.
 */

public class CH1BankAccount {

    private double balance;                             // account balance

    public CH1BankAccount(double openingBalance) {      // constructor
        balance = openingBalance;
    }

    public void deposit(double amount) {                // makes deposit
        balance = balance + amount;
    }

    public void withdraw(double amount) {               // makes withdrawal
        balance = balance - amount;
    }

    public void display() {                             // displays balance
        System.out.println("balance=" + balance);
    }
    
}  // end class BankAccount

