package w1d4;

import java.util.Scanner;

/* OUTPUT Problem #1 and #2
Stack 1 : 
The value 20 has been added.
The value 40 has been added.
The value 60 has been added.
The value 80 has been added.
The value 100 has been added.

Pop! 100 is gone.
Pop! 80 is gone.
Pop! 60 is gone.
Pop! 40 is gone.
Pop! 20 is gone.

Stack 1 is empty? true
Stack 1 is full? false

Stack 2 : 
The value 10 has been added.
The value 20 has been added.
The value 30 has been added.
The value 40 has been added.
The value 50 has been added.
Stack 2 : [ 50 40 30 20 10 ]

Stack 2 is full? true
Stack 2 is empty? false

Stack 3 : 
The value 60 has been added.
The value 70 has been added.
The value 80 has been added.
The value 90 has been added.
The value 100 has been added.
Stack 3 : [ 100 90 80 70 60 ]

The size of Stack 1 is : 0
The size of Stack 2 is : 5
The size of Stack 3 is : 5

Merging : Stack 1 and Stack 2
Merge unnessecary. There is an empty stack.

Merging : Stack 2 and Stack 3
Stacks have been merged.

The size of merged stack is : 10
Merged Stack : [ 100 90 80 70 60 50 40 30 20 10 ]

Stack 2: Would you like to push, pop, or peek? peek
The number at the top of the list is: 50
Stack 2: Would you like to push, pop, or peek? push
What whole number would you like to add? 15
Can’t insert, stack is full.
Stack 2: Would you like to push, pop, or peek? pop
Pop! 50 is gone.
Stack 2: Would you like to push, pop, or peek? push
What whole number would you like to add? 15
The value 15 has been added.
Stack 2: Would you like to push, pop, or peek? peek
The number at the top of the list is: 15
Stack 2: Would you like to push, pop, or peek? pop
Pop! 15 is gone.
Stack 2: Would you like to push, pop, or peek? pop
Pop! 40 is gone.
Stack 2: Would you like to push, pop, or peek? pop
Pop! 30 is gone.
Stack 2: Would you like to push, pop, or peek? pop
Pop! 20 is gone.
Stack 2: Would you like to push, pop, or peek? pop
Pop! 10 is gone.
Stack 2: Would you like to push, pop, or peek? pop
Can’t Delete, stack is empty.
Stack 2: Would you like to push, pop, or peek? quit
Quit
 */

public class StackApp {

    public static void main(String[] args) {

        StackX theStack1 = new StackX(5);            // make new stack
        System.out.println("Stack 1 : ");
        theStack1.push(20);                          // push items onto stack
        theStack1.push(40);
        theStack1.push(60);
        theStack1.push(80);
        theStack1.push(100);
        System.out.println();
//--------------------------------------------------------------

        while (!theStack1.isEmpty())                // until it's empty,
        {
            theStack1.pop();                        // delete item from stack
        }  // end while

        System.out.println();
        System.out.println("Stack 1 is empty? " + theStack1.isEmpty());
        System.out.println("Stack 1 is full? " + theStack1.isFull());
        System.out.println();
//--------------------------------------------------------------       

        StackX theStack2 = new StackX(5);
        System.out.println("Stack 2 : ");
        theStack2.push(10);                         // push items onto stack
        theStack2.push(20);
        theStack2.push(30);
        theStack2.push(40);
        theStack2.push(50);

        System.out.print("Stack 2 : ");
        System.out.println(theStack2);
        System.out.println();
//-------------------------------------------------------------- 
        
        System.out.println("Stack 2 is full? " + theStack2.isFull());
        System.out.println("Stack 2 is empty? " + theStack2.isEmpty());
        System.out.println();
//--------------------------------------------------------------       
        
        StackX theStack3 = new StackX(5);
        System.out.println("Stack 3 : ");
        theStack3.push(60);                         // push items onto stack
        theStack3.push(70);
        theStack3.push(80);
        theStack3.push(90);
        theStack3.push(100);

        System.out.print("Stack 3 : ");
        System.out.println(theStack3);
        System.out.println();
//-------------------------------------------------------------- 

        System.out.println("The size of Stack 1 is : " + theStack1.stackSize());
        System.out.println("The size of Stack 2 is : " + theStack2.stackSize());
        System.out.println("The size of Stack 3 is : " + theStack3.stackSize());
        System.out.println();
//--------------------------------------------------------------

        System.out.println("Merging : Stack 1 and Stack 2");
        merge(theStack1, theStack2);
        System.out.println();
//--------------------------------------------------------------     
        
        int newSize = theStack2.stackSize() + theStack3.stackSize();
        StackX theStack4 = new StackX(newSize);
        System.out.println("Merging : Stack 2 and Stack 3");
        theStack4 = merge(theStack2, theStack3);
        System.out.println();
        
        System.out.println("The size of merged stack is : " + theStack4.stackSize());
        System.out.print("Merged Stack : ");
        System.out.println(theStack4);
        System.out.println();
//--------------------------------------------------------------   

        String option;
        String temp;
        long num;

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Stack 2: Would you like to push, pop, or peek? ");
            option = in.next();                      // read a string

            if (option.equals("quit") || option.equals("Quit") || option.equals("")) {
                break;
            } else if (option.equals("push") || option.equals("Push")) {
                Scanner input = new Scanner(System.in);
                System.out.print("What whole number would you like to add? ");
                temp = input.next();                // read a string
                num = Long.valueOf(temp).longValue();
                theStack2.push(num);
            } else if (option.equals("pop") || option.equals("Pop")) {
                theStack2.pop();
            } else if (option.equals("peek") || option.equals("Peek")) {
                if (theStack2.peek() != -1) {
                    System.out.println("The number at the top of the list is: " + theStack2.peek());
                } else {
                    System.out.println("The stack is empty.");
                }
            } else {
                System.out.print("Please try again.");
            }

        }  // end while

        System.out.println("Quit");

    }  // end main()

    public static StackX merge(StackX first, StackX second) {
        
        if (!first.isEmpty() && !second.isEmpty())
        {
            int sizeFirst = first.stackSize();
            int sizeSecond = second.stackSize();
            int sizeBoth = first.stackSize() + second.stackSize();
            long[] temp = new long[sizeBoth];
            StackX holdFirst = new StackX(first.stackSize());
            StackX holdSecond = new StackX(second.stackSize());
            int position = 0;

            for (int k = 0; k < sizeSecond; k++) {
                temp[k] = second.quietPop();
                holdSecond.quietPush(temp[k]);
                position++;
            }
            
            for (int a = 0; a < sizeSecond; a++) {
                second.quietPush(holdSecond.quietPop());
            }
                            
            for (int l = position; l < sizeBoth; l++) {
                temp[l] = first.quietPop();
                holdFirst.quietPush(temp[l]);
                position++;
            }
            
            for (int b = 0; b < sizeFirst; b++) {
                first.quietPush(holdFirst.quietPop());
            }

            StackX mergedStack = new StackX(temp.length);
            for (int m = (position - 1); m >= 0; m--) {
                mergedStack.quietPush(temp[m]);
            }
            
            System.out.println("Stacks have been merged.");
            return mergedStack;
            
        } else {
            System.out.println("Merge unnessecary. There is an empty stack.");
            return null;
        }
        
    }

}  // end class StackApp

/**
 *
 * @author ZBrodale
 */
