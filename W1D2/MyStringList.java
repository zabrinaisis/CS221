/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d2;

/*  OUTPUT Problem# 1
The MyStringList object contains 3 elements.
Which are: 'hello' 'hi' 'nice to see you' 
The total length of the array is 4.

The second element is: 'hi'.

Is the word 'hello' in the array? true
What about the word 'goodbye'? false

The MyStringList object contains 4 elements.
Which are: 'hello' 'hi' 'nice to see you' 'goodbye' 
The total length of the array is 4.
... Resizing...
The MyStringList object contains 5 elements.
Which are: 'hello' 'hi' 'nice to see you' 'goodbye' 'aloha' 
The total length of the array is 8.

Inserted 'good morning' into position 1.
The MyStringList object contains 6 elements.
Which are: 'hello' 'good morning' 'hi' 'nice to see you' 'goodbye' 'aloha' 
The total length of the array is 6.

Removed 'good morning' from array.
The MyStringList object contains 5 elements.
Which are: 'hello' 'hi' 'nice to see you' 'goodbye' 'aloha' 
The total length of the array is 6.
*/

public class MyStringList {

    private final int INITIAL_LENGTH = 4;
    private String[] strArray = new String[INITIAL_LENGTH];
    private int size;

    public void MyStringList() {
    }

    public void add(String s) {
        if (strArray.length == size) {
            resize();
        }
        strArray[size] = s;
        size++;
    }

    public String get(int i) {
        return strArray[i];
    }

    public boolean find(String s) {
        boolean found = false;
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = strArray[i].compareTo(s);
            if (result == 0) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        return found;
    }

    public void insert(String s, int pos) {
        if ((size + 1) == strArray.length) {
            resize();
        }
        if (pos < size) {
            String[] temp = new String[size + 1];
            System.arraycopy(strArray, 0, temp, 0, pos);
            temp[pos] = s;
            System.out.println("Inserted '" + s + "' into position " + pos + ".");
            System.arraycopy(strArray, pos, temp, pos + 1, size - pos);
            strArray = temp;
            size++;
        } else {
            add(s);
            System.out.println("Inserted '" + s + "' into position " + size + ".");
            size++;
        }
    }

    public void remove(String s) {
        if (find(s)) {
            int result;
            int position = 0;
            for (int i = 0; i < size; i++) {
                result = strArray[i].compareTo(s);
                if (result == 0) {
                    String[] temp = new String[size];
                    System.arraycopy(strArray, 0, temp, 0, position);
                    System.arraycopy(strArray, position + 1, temp, position, (size - 1) - position);
                    strArray = temp;
                    System.out.println("Removed '" + s + "' from array.");
                    size--;
                } else {
                    position++;
                }
            }

        } else {
            System.out.println("String is not in array.");
        }
    }

    public void resize() {
        System.out.println("... Resizing...");
        int newSize = size * 2;
        String[] temp = new String[newSize];
        System.arraycopy(strArray, 0, temp, 0, size);
        strArray = temp;
    }

    public int size() {
        return size;
    }

    public void display() {
        String sizeSt;
        String containsSt = "";
        String lengthSt;

        sizeSt = "The MyStringList object contains " + size + " elements.";
        System.out.println(sizeSt);

        for (int i = 0; i < size; i++) {
            containsSt += "'" + strArray[i] + "' ";
        }
        System.out.println("Which are: " + containsSt);

        lengthSt = "The total length of the array is " + strArray.length + ".";
        System.out.println(lengthSt);
    }

    public static void main(String[] args) {

        MyStringList obj = new MyStringList();

        obj.add("hello");
        obj.add("hi");
        obj.add("nice to see you");
        obj.display();
        System.out.println();

        System.out.println("The second element is: '" + obj.get(1) + "'.");
        System.out.println();

        System.out.println("Is the word 'hello' in the array? " + obj.find("hello"));
        System.out.println("What about the word 'goodbye'? " + obj.find("goodbye"));
        System.out.println();

        obj.add("goodbye");
        obj.display();
        obj.add("aloha");
        obj.display();
        System.out.println();

        obj.insert("good morning", 1);
        obj.display();
        System.out.println();
        
        obj.remove("good morning");
        obj.display();
        System.out.println();
    }
}

/**
 *
 * @author Zbrodale
 */
