package w2d2;

/**
 *  Generic Node class for Problem# 2
 * 
 */

public class Node {

    public String value;
    public Node next;
    public Node previous;

    public Node(String value) {
        this.value = value;
    }

    public String toString() {
        return value;
    }

}
/**
 *
 * @author ZBrodale
 */
