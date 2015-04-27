/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

import java.util.Scanner;

/* OUTPUT
Enter an integer: 12304560
    Odd digits: 3
    Even digits: 3
    Zero digits: 2
*/

public class EvenOddCount {

    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;
        int zeroCount = 0;
        int each = 0;

        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        String num = input.next();

        for (int i = 0; i < num.length(); i++) {
            each = num.charAt(i);
            if (each == 48) {
                zeroCount++;
            } else {
                if ((each % 2) == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("    Odd digits: " + oddCount);
        System.out.println("    Even digits: " + evenCount);
        System.out.println("    Zero digits: " + zeroCount);

    }
}

/**
 *
 * @author Zbrodale
 */