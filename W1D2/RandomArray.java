/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2;

/* OUTPUT Problem# 2
The size of the array is: 50

The size of the array is: 50

The value at position 12 is: 60

The sublist is: 25 96 9 84 43 74 75 

The size of the array is: 0
*/

public class RandomArray {

    private final int INITIAL_LENGTH = 50;
    private int[] randomArray = new int[INITIAL_LENGTH];
    private int size;

    public void RandomArray() {
    }

    public void randomNums(int q) {
        int[] temp = new int[q];
        for (int i = 0; i < q; i++) {
            double num = Math.random() * 100;
            int cast = (int) num;
            temp[i] = cast;
        }
        randomArray = temp;
        size = q;
    }

    public void removeDuplicates() {

    }

    public void removeAll() {
        randomArray = null;
        size = 0;
    }

    public int arraySize() {
        return size;
    }

    public int getValue(int i) {
        return randomArray[i];
    }

    public void subList(int start, int end) {
        String newList = "";
        int formula = (end + 1) - start;
                int[] sub = new int[formula];
        for (int i = 0; i < formula; i++) {
            sub[i] = randomArray[start + i];
            newList += sub[i] + " ";
        }
        System.out.println("The sublist is: " + newList);

    }

    public static void main(String[] args) {
        RandomArray obj = new RandomArray();

        obj.randomNums(50);
        System.out.println("The size of the array is: " + obj.arraySize());
        System.out.println();

        obj.removeDuplicates();
        System.out.println("The size of the array is: " + obj.arraySize());
        System.out.println();

        System.out.println("The value at position 12 is: " + obj.getValue(12));
        System.out.println();

        obj.subList(14, 20);
        System.out.println();

        obj.removeAll();
        System.out.println("The size of the array is: " + obj.arraySize());

    }

}

/**
 *
 * @author ZBrodale
 */
