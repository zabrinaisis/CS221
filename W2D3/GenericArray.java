package w2d3;

/** Problem# 4: Generic Array with countOccurrence method.
**/

public class GenericArray<T> {

    public T[] stackArray;
    public int maxSize;
    private int top;

    public GenericArray(int maxSize) {
        this.maxSize = maxSize;
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }
    
    public void countOccurrences(T[] array, T item) {
        int count = 0;
        for (int i = 0; i < top; i++) {
            if (stackArray[i] == item) {
                count++;
            }
        }
        System.out.println("Count number of " + item + " is: " + count);        
    }
    
    public boolean find(T n)
    {
        boolean found = false;
        for (int i = 0; i < top; i++) {
            if (stackArray[i] == n) {
                found = true;
                break;
            } else {
                found = false;
            }
        }
        return found;
    }

    public void push(T j)
    {
        stackArray[++top] = j;  
    }

    public T pop() 
    {
        return stackArray[top--];  
    }

    public T peek()
    {
        return stackArray[top];
    }

    public boolean isEmpty()
    {
        return (top == -1);
    }

    public boolean isFull()
    {
        return (top == maxSize - 1);
    }

    public String toString() {
        String out = "";
        for (int i = top; i >= 0; i--) {
            out = out + stackArray[i] + " ";
        }

        return "[ " + out + "]";
    }
}
/**
 *
 * @author ZBrodale
 */
