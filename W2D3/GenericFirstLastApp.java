package w2d3;

/* OUTPUT Problem# 2: Implementation of GenericFirstLast.
List (first-->last): 66 44 22 11 33 55 
List (first-->last): 44 22 11 33 55 
 */

public class GenericFirstLastApp {

    public static void main(String[] args) {
        
        GenericFirstLast theList = new GenericFirstLast();

        theList.insertFirst(22);       
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);       
        theList.insertLast(33);
        theList.insertLast(55);

        theList.displayList();         
        theList.deleteFirst();         
        theList.displayList();         
        
    }
}
/**
 *
 * @author Zbrodale
 */
