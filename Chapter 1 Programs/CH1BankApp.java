/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fixcode;

/**
 *  Test drives an account object and manipulates.
 *  Uses display, deposit, and withdraw methods from CH1BankAccount.
 */

public class CH1BankApp {

    public static void main(String[] args) {
        
        CH1BankAccount ba1 = new CH1BankAccount(100.00);    // create acct

        System.out.print("Before transactions, ");
        ba1.display();                                      // display balance

        ba1.deposit(100.00);                                // make deposit
        ba1.withdraw(20.00);                                // make withdrawal

        System.out.print("After transactions, ");
        ba1.display();                                      // display balance
        
    }  // end main()
}  // end class BankApp

