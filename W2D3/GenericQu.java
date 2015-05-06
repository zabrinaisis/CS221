package w2d3;

/**
 *  Generic version of Queue.
 */

public class GenericQu<T> {

    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int nItems;
//--------------------------------------------------------------

    public GenericQu(int s)
    {
        maxSize = s;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
//--------------------------------------------------------------

    public void insert(T j)
    {
        if (rear == maxSize - 1)
        {
            rear = -1;
        }
        queArray[++rear] = j;
        nItems++;
    }
//--------------------------------------------------------------

    public T remove()
    {
        T temp = queArray[front++];
        
        if (front == maxSize) {
            front = 0;
        }
        
        nItems--;
        return temp;
    }
//--------------------------------------------------------------

    public T peekFront()
    {
        return queArray[front];
    }
//--------------------------------------------------------------

    public boolean isEmpty()
    {
        return (nItems == 0);
    }
//--------------------------------------------------------------

    public boolean isFull()
    {
        return (nItems == maxSize);
    }
//--------------------------------------------------------------

    public int size()
    {
        return nItems;
    }

}
/**
 *
 * @author Zbrodale
 */
