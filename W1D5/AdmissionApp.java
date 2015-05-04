package w1d5;

import java.util.LinkedList;
import java.util.Queue;

/* OUTPUT Problem# 3
The front item in the queue is 100001: John Smith, 555-909-7777

The size of the queue is : 5

The items in the queue were : 
[
	100001: John Smith, 555-909-7777
	100002: Mary Turner, 555-909-1256
	100003: Jane Jones, 555-909-1256
	100004: Stephanie Black, 555-909-1256
	100005: Britney Anderson, 555-909-1256
]

Is the queue empty? true 
*/

public class AdmissionApp {
    
    public static void main(String[] args) {
        
        Queue<Admission> q = new LinkedList<Admission>();
        
        q.offer(new Admission("John Smith", "555-909-7777"));
        q.offer(new Admission("Mary Turner", "555-909-1256"));
        q.offer(new Admission("Jane Jones", "555-909-1256"));
        q.offer(new Admission("Stephanie Black", "555-909-1256"));
        q.offer(new Admission("Britney Anderson", "555-909-1256"));
        
        System.out.println("The front item in the queue is " + q.peek());
        System.out.println();
        
        System.out.println("The size of the queue is : " + q.size());
        System.out.println();
        
        System.out.println("The items in the queue were : ");
        System.out.println("[");
        while(!q.isEmpty()) {
            System.out.println("\t" + q.remove());
        }
        System.out.println("]");
        System.out.println();
        
        System.out.println("Is the queue empty? " + q.isEmpty());
       
    }
    
    public void displayAdmission(int i) {

    }

}
/**
 *
 * @author ZBrodale
 */
