package w2d3;

/* OUTPUT Problem# 1: Implementation of the GenericQu (QueueApp).
Front of the Queue : 10
Front of the Queue : 40
Size of the Queue : 5
40 50 60 70 80 
Size of the Queue : 0
 */
public class GenericQuApp {

    public static void main(String[] args) {
        
        GenericQu theQueue = new GenericQu(5);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        System.out.println("Front of the Queue : " + theQueue.peekFront());
        theQueue.remove();           
        theQueue.remove();              
        theQueue.remove();
        theQueue.insert(50);            
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        System.out.println("Front of the Queue : " + theQueue.peekFront());
        System.out.println("Size of the Queue : " + theQueue.size());
        
        Object n;
        while (!theQueue.isEmpty())
        {   
            n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("Size of the Queue : " + theQueue.size());
        
    }
}
/**
 *
 * @author Zbrodale
 */
