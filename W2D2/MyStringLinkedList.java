package w2d2;

/**
 *  Problem# 2
 *
 */

public class MyStringLinkedList {

    public Node first;
    public Node last;
    private int numLinks;
//--------------------------------------------------------------   

    public MyStringLinkedList() {
        first = null;
        last = null;
        numLinks = 0;
    }
//--------------------------------------------------------------    

    public void addFront(String item) {
        Node newNode = new Node(item);

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }

        newNode.next = first;
        first = newNode;
        numLinks++;

    }
//--------------------------------------------------------------    

    public void addLast(String item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }

        last = newNode;
        numLinks++;
    }
//--------------------------------------------------------------    

    public boolean postAddNode(Node n, String value) {
        Node current = first;

        while (current.value != value) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Node newNode = new Node(value);

        if (current == last) {
            last = newNode;
            newNode.previous = current;
            current.next = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
            newNode.previous = current;
            current.next = newNode;
        }
        
        numLinks++;
        return true;
    }
//--------------------------------------------------------------    

    public int size()
    {
        return numLinks;
    }
//--------------------------------------------------------------    

    public boolean isEmpty()
    {
        return (first == null);
    }
//--------------------------------------------------------------    

    public boolean preAddNode(Node n, String value)
    {
        Node current = first;

        while (current.value != value) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }

        Node newNode = new Node(value);

        if (current == last) {
            last = newNode;
            newNode.previous = current;
            current.next = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
            newNode.previous = current;
            current.next = newNode;
        }

        numLinks++;
        return true;
    }
//--------------------------------------------------------------    

    public Node findLast()
    {
        Node current = last;
        return current;
    }
//--------------------------------------------------------------    

    public Node findItem(String str)
    {
        Node current = first;
        
        while (current.value != str)
        {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        
        return current;
    }
//--------------------------------------------------------------    

    public void deleteNode(Node n)
    {
        Node current = first;

        while (current != n)
        {
            current = current.next;
            if (current == null) {
                System.out.println("Not in list.");
                break;
            }
        }
        
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        
        if (current == last) {
            last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        
        numLinks--;
    }
//--------------------------------------------------------------    

    public void deleteList()
    {
        first = null;
        last = null;
        numLinks = 0;
    }
//--------------------------------------------------------------    

    public void printReverse()
    {
        System.out.print("List (last-->first): ");
        Node current = last;

        while (current != null) {
            current.toString(); // display data
            current = current.previous; // move to previous link
        }

        System.out.println("");
    }

}
/**
 *
 * @author Zbrodale
 */
