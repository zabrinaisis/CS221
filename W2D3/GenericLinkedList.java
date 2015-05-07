package w2d3;

/** Problem# 3: Generic Linked List.
 *  Uses Generic Links with 2 data values.
 */

public class GenericLinkedList<T> {

    private GenericLink2 first;

// -------------------------------------------------------------
    public GenericLinkedList()
    {
        first = null;
    }

// -------------------------------------------------------------

    public boolean isEmpty()
    {
        return (first == null);
    }
// -------------------------------------------------------------
 
    public void insertFirst(T d1, T d2) 
    {
        GenericLink2 newLink = new GenericLink2(d1, d2);
        newLink.next = first;
        first = newLink;
    }

    // -------------------------------------------------------------

    public GenericLink2 deleteFirst()
    {                        
        GenericLink2 temp = first;  
        first = first.next;       
        return temp;             
    }

    // -------------------------------------------------------------

    public void displayList() {
        System.out.print("List (first-->last): ");
        GenericLink2 current = first; 
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
 * @author ZBrodale
 **/
