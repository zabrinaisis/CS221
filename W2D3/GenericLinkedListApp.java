package w2d3;

/* Problem# 3: Generic Linked List ouput.
List (first-->last): 88 8.99 66 6.99 44 4.99 22 2.99 
Deleted 88 8.99 
Deleted 66 6.99 
Deleted 44 4.99 
Deleted 22 2.99 
List (first-->last): 
 */

public class GenericLinkedListApp {

    public static void main(String[] args) {
        
        GenericLinkedList theList = new GenericLinkedList();

        theList.insertFirst(22, 2.99);    
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();           

        while (!theList.isEmpty())
        {
            GenericLink2 aLink = theList.deleteFirst();
            System.out.print("Deleted ");         
            aLink.displayLink();
            System.out.println("");
        }
        
        theList.displayList();             
        
    }  
}
/**
 *
 * @author ZBrodale
 */
