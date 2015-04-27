/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

import java.util.Scanner;

/* OUTPUT Problem# 2
Enter an amount in the format 11.56: 11.56
    11 dollars
    2 quarters
    0 dimes
    1 nickles
    1 pennies
*/

public class Money {

    public static void main(String[] args) {

        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;
        Boolean result = true;

        System.out.print("Enter an amount in the format 11.56: ");
        Scanner input = new Scanner(System.in);
        double d = input.nextDouble();

        int dollars = (int) d;

        double change = d - dollars;

        while (result) {
            if (change > 0.24) {
                double q = change / 0.25;
                quarters = (int) q;
                change = change - 0.25 * quarters;
            } else if (change > 0.90) {
                double di = change / 0.10;
                dimes = (int) di;
                change = change - 0.10 * dimes;
            } else if (change > 0.04) {
                double n = change / 0.05;
                nickles = (int) n;
                change = change - 0.05 * nickles;
            } else {
                double p = change / 0.01;
                pennies = (int) p;
                result = false;
            }
        }
        
        System.out.println("    " + dollars + " dollars");
        System.out.println("    " + quarters + " quarters");
        System.out.println("    " + dimes + " dimes");
        System.out.println("    " + nickles + " nickles");
        System.out.println("    " + pennies + " pennies");

    }

}

/**
 *
 * @author Zbrodale
 */
