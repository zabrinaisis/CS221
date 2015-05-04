package w1d5;

/**
 * EXTRA CREDIT Generic character Deque class.
 */
public class CharDeque {

    private int maxSize;
    private char[] dqArray;
    private int front;
    private int rear;
    private int nItems;
//--------------------------------------------------------------

    public CharDeque(int s) {
        maxSize = s;
        dqArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
//--------------------------------------------------------------

    public void insertRight(char j) {
        if (nItems != maxSize - 2) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            dqArray[++rear] = j;
            nItems++;
        } else {
            System.out.println("The Queue is full.");
        }
    }
//--------------------------------------------------------------

    public void insertLeft(char j) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        if (nItems != maxSize - 2) {
            for (int i = 0; i < nItems; i++) {
                dqArray[i] = dqArray[i + 1];
            }
            nItems++;
        } else {
            System.out.println("The Queue is full.");
        }
    }
//--------------------------------------------------------------

    public char removeRight() {
        if (nItems != 0) {
            nItems--;
            return dqArray[rear--];
        } else {
            System.out.println("Queue is empty.");
            return 33;
        }
    }
//--------------------------------------------------------------    

    public char removeLeft() {
        if (nItems != 0) {
            char temp = dqArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;            
            return temp;
        } else {
            System.out.println("Queue is empty.");
            return 33;
        }
    }
//--------------------------------------------------------------

    public boolean isEmpty() {
        return (nItems == 0);
    }
//--------------------------------------------------------------

    public boolean isFull() {
        return (nItems == maxSize);
    }
//--------------------------------------------------------------

    public int size() {
        return nItems;
    }

}  // end class

/**
 *
 * @author ZBrodale
 */
