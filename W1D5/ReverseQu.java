package w1d5;

import java.util.Scanner;

/* OUTPUT Problem# 2
Input an integer : 12345
Integer reversed : 54321

Input an integer : quit
Quit
*/

public class ReverseQu {

    public static void main(String[] args) {
        String input;
        String output;

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input an integer : ");
            input = in.next();

            if (input.equals("quit") || input.equals("Quit")
                    || input.equals("")) {
                break;
            } else {
                int queueSize = input.length();
                CharQueue theQueue = new CharQueue(queueSize);

                for (int j = queueSize - 1; j >= 0; j--) {
                    char ch = input.charAt(j);
                    theQueue.insert(ch);
                }
                
                output = "";
                while (!theQueue.isEmpty()) {
                    char ch = theQueue.remove();
                    output = output + ch;
                }

                System.out.println("Integer reversed : " + output);
                System.out.println();
            }

        }  // end while

        System.out.println("Quit");

    }
}

/**
 *
 * @author ZBrodale
 */
