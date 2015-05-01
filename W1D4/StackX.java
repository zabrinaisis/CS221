package w1d4;

// See OUTPUT for StackApp class.

public class StackX {

    private int maxSize;                    // size of stack array
    private long[] stackArray;
    private int top;                        // top of stack
//--------------------------------------------------------------

    public StackX(int s)                    // constructor
    {
        maxSize = s;                        // set array size
        stackArray = new long[maxSize];     // create array
        top = -1;                           // no items yet
    }
//--------------------------------------------------------------    

    public void push(long j)                // put item on top of stack
    {
        if (!isFull()) {
            System.out.println("The value " + j + " has been added.");
            stackArray[++top] = j;
        } else {
            System.out.println("Can’t insert, stack is full.");
        }
    }
//--------------------------------------------------------------    

    public long pop()                       // take item from top of stack
    {
        if (!isEmpty()) {
            System.out.println("Pop! " + stackArray[top] + " is gone.");
            return stackArray[top--];       // access item, decrement top
        } else {
            System.out.println("Can’t Delete, stack is empty.");
            return -1;
        }
    }
//--------------------------------------------------------------
    
    public long peek()                      // peek at top of stack
    {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            return -1;
        }
        
    }
//--------------------------------------------------------------

    public boolean isEmpty()                // true if stack is empty
    {
        return (top == -1);
    }
//--------------------------------------------------------------

    public boolean isFull()                 // true if stack is full
    {
        return (top == (maxSize - 1));
    }
//--------------------------------------------------------------    

    public String toString()
    {
        String out = "";
        for (int i = top; i >= 0; i--) {
            out = out + stackArray[i] + " ";
        }
        return "[ " + out + "]";
    }
//--------------------------------------------------------------    

    public int stackSize()
    {
        return (top+1);
    }
//--------------------------------------------------------------    
    
    public boolean find(long num)
    {
        boolean found = false;
        for (int i = 0; i < top; i++) {
            if (stackArray[i] == num) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        return found;
    }
//--------------------------------------------------------------    
    
    public void clear()
    {
        top = -1;
        System.out.println("Stack empty.");
    }
//--------------------------------------------------------------
    
    public long quietPop()                        // take item from top of stack
    {
        return stackArray[top--];               // access item, decrement top
        
    }
//--------------------------------------------------------------
    
    public long quietPush(long num)
    {
        stackArray[++top] = num;
        return stackArray[top];
        
    }    


}  // end class StackX 

/**
 *
 * @author ZBrodale
 */
