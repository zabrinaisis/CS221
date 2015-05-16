package cs221.W3D5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Problem# 1 OUTPUT
Enter size of hash table: 11
Enter initial number of items: 9
Enter first letter of show, count, insert, delete, or find: i
Enter key value to insert: 33
Enter first letter of show, count, insert, delete, or find: s
Table: 11 45 ** 102 81 103 28 59 33 86 92 
Enter first letter of show, count, insert, delete, or find: c
10
Enter first letter of show, count, insert, delete, or find: f
Enter key value to find: 102
Found 102
Enter first letter of show, count, insert, delete, or find: d
Enter key value to delete: 45
Enter first letter of show, count, insert, delete, or find: s
Table: 11 -1 ** 102 81 103 28 59 33 86 92 
**/

public class HashTableApp {

    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey, size, n, keysPerCell;
        // get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        keysPerCell = 10;
        // make table
        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) // insert data
        {
            aKey = (int) (java.lang.Math.random()
                    * keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }

        while (true) // interact with user
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, count, insert, delete, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'c':
                    System.out.println(theHashTable.getSize());
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }  // end while
    }  // end main()
//--------------------------------------------------------------

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
//--------------------------------------------------------------

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
//-------------------------------------------------------------

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    
}  // end class HashTableApp

/**
 *
 * @author Zabrina
 */
