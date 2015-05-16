package cs221.W3D5;

/**
 *  Creates a HashTable object.
 *  Methods: displayTable(), insert(), delete(), find(), and getSize().
 */

public class HashTable {

    private DataItem[] hashArray;                       // array holds hash table
    private int arraySize;
    private DataItem nonItem;                           // for deleted items
    private int count;
//-------------------------------------------------------------

    public HashTable(int size)                          // constructor
    {
        arraySize = size;
        count = 0;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);                     // deleted item key is -1
    }
//-------------------------------------------------------------

    public void displayTable()
    {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }
//-------------------------------------------------------------

    public int hashFunc(int key)
    {
        return key % arraySize;                         // hash function
    }
//-------------------------------------------------------------

    public void insert(DataItem item)                   // insert a DataItem
                                                        // (assumes table not full)
    {
        int key = item.getKey();                        // extract key
        int hashVal = hashFunc(key);                    // hash the key
        int mult = 1;
        int step = 1;
                                                        // until empty cell or -1,
        while (hashArray[hashVal] != null
                && hashArray[hashVal].getKey() != -1) {
            hashVal = hashVal + step;                   // go to next quad cell
            mult++;
            step = mult*mult;                           // wraparound if necessary
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;                      // insert item
        count++;
    }  // end insert()
//-------------------------------------------------------------

    public DataItem delete(int key)                     // delete a DataItem
    {
        int hashVal = hashFunc(key);                    // hash the key

        while (hashArray[hashVal] != null)              // until empty cell,
        {                                               // found the key?
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal];     // save item
                hashArray[hashVal] = nonItem;           // delete item
                return temp;                            // return item
            }
            ++hashVal;                                  // go to next cell
            hashVal %= arraySize;                       // wraparound if necessary
        }
        count--;
        return null;                                    // can't find item
    }  // end delete()
//-------------------------------------------------------------

    public DataItem find(int key)                       // find item with key
    {
        int hashVal = hashFunc(key);                    // hash the key

        while (hashArray[hashVal] != null)              // until empty cell,
        {                                               // found the key?
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];              // yes, return item
            }
            ++hashVal;                                  // go to next cell
            hashVal %= arraySize;                       // wraparound if necessary
        }
        return null;                                    // can't find item
    }
//-------------------------------------------------------------

    public int getSize()                                // find item with key    
    {
        return count;
    }

}  // end class HashTable

/**
 *
 * @author Zabrina
 */
