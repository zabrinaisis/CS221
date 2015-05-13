package cs221.W3D2;

/**
 *  Creates a node object with display method.
 */

public class Node {

    public int iData;               // data item (key)
    public double dData;            // data item
    public Node leftChild;          // this node's left child
    public Node rightChild;         // this node's right child

    public void displayNode()       // display ourself
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
/**
 *
 * @author Zabrina
 */
