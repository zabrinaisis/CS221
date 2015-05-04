package w1d5;

/**
 * Priority queue with O(1) insertion time, slower removal. New display method.
 */

public class PriorityQ {

    private int maxSize;
    private long[] queArray;
    private int nItems;
//-------------------------------------------------------------

    public PriorityQ(int s)
    {
        maxSize = s;
        queArray = new long[maxSize];
        nItems = 0;
    }
//-------------------------------------------------------------

    public void insert(long item)
    {
        queArray[++nItems] = item;
    }
//-------------------------------------------------------------

    public long remove()
    {        
        long max = 0;
        
        for (int j = 0; j < nItems; j++) {
                if (queArray[j] > max) {
                    max = queArray[j];
                }
        }

        if (nItems == 0) {
            System.out.println("Cannot remove. No items in queue.");
        } else {
            for (int k = 0; k < nItems; k++) {
                if (queArray[k] == max) {    
                    queArray[k] = queArray[k+1];
                }
            }
        }
        return max;
        
    }
//-------------------------------------------------------------

    public void display()
    {
        System.out.print("[ ");
        for (int i = 0; i > nItems; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");        
    }
//-------------------------------------------------------------
    
    public long peekMin()
    {
        return queArray[nItems - 1];
    }
//-------------------------------------------------------------

    public boolean isEmpty()
    {
        return (nItems == 0);
    }
//-------------------------------------------------------------

    public boolean isFull()
    {
        return (nItems == maxSize);
    }

}  // end class PriorityQ    

/**
 *
 * @author ZBrodale
 */
