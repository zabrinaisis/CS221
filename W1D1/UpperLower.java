/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

import java.util.Scanner;

/* OUTPUT for Problem# 1
   Enter a character: 0
   Character is a number.
*/

public class UpperLower {

    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= 97 && ch <= 122) {
            System.out.println("Character is lower case.");
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("Character is upper case.");
        } else if (ch >= 33 && ch <= 47) {
            System.out.println("Character is a special character.");
        } else if (ch >= 58 && ch <= 64) {
            System.out.println("Character is a special character.");
        } else if (ch >= 91 && ch <= 96) {
            System.out.println("Character is a special character.");
        } else if (ch >= 123 && ch <= 126) {
            System.out.println("Character is a special character.");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("Character is a number.");
        } else {
            System.out.println("Character is unknown.");
        }
    }

}

/**
 * 
 * @author Zbrodale
 */
