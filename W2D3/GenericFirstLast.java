package w2d3;

/** Problem# 2
 *  Generic Double Ended Linked List (FirstLast).
 */

public class GenericFirstLast<T> {

    private GenericLink first;
    private GenericLink last;
//-------------------------------------------------------------

    public GenericFirstLast()
    {
        first = null;
        last = null;
    }
//-------------------------------------------------------------

    public boolean isEmpty()
    {
        return first == null;
    }
//-------------------------------------------------------------

    public void insertFirst(T d)
    {
        GenericLink newLink = new GenericLink(d);

        if (isEmpty()) {
            last = newLink;
        }
        
        newLink.next = first;
        first = newLink;
    }
//-------------------------------------------------------------

    public void insertLast(T d)
    {
        GenericLink newLink = new GenericLink(d);
        
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        
        last = newLink;
    }
//-------------------------------------------------------------

    public T deleteFirst()
    {
        T temp = (T) first.data; 
        
        if (first.next == null) {
            last = null;               
        }
        
        first = first.next;
        return temp;
    }

//-------------------------------------------------------------
    public void displayList()
    {
        System.out.print("List (first-->last): ");
        GenericLink current = first;
        
        while (current != null)
        {
            current.displayLink();
            current = current.next;
        }
        
        System.out.println("");
    }
}
/**
 *
 * @author Zbrodale
 */
