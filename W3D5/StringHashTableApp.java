package cs221.W3D5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Problem# 2 OUTPUT
Enter size of hash table: 7
Enter first letter of show, count, insert, delete, or find: i
Enter key value to insert: Hi
Enter first letter of show, count, insert, delete, or find: s
Table: ** ** ** ** ** ** 2337:Hi 
Enter first letter of show, count, insert, delete, or find: f
Enter key value to find: Hi
Found Hi
Enter first letter of show, count, insert, delete, or find: c
1
**/

public class StringHashTableApp {

    public static void main(String[] args) throws IOException {
        StringDataItem item;
        int theKey, size, n;
        String aKey;
        // get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        // make table
        StringHashTable theHashTable = new StringHashTable(size);

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
                    aKey = getString();
                    item = new StringDataItem(aKey);
                    theHashTable.insert(item);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getString();
                    theKey = aKey.hashCode();
                    theHashTable.delete(theKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getString();
                    theKey = aKey.hashCode();
                    item = theHashTable.find(theKey);
                    if (item != null) {
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
