package cs221.W3D2;

import java.util.HashSet;
import java.util.Set;

/**
 * Creates a binary tree object with methods.
 */

public class TheTree {

    private Node root;
//-------------------------------------------------------------

    public TheTree() {
        root = null;
    }
//-------------------------------------------------------------

    public Node minimum() {
        Node current = new Node();
        Node last = new Node();
        current = root;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }
//-------------------------------------------------------------

    public Node maximum() {
        Node current = new Node();
        Node last = new Node();
        current = root;
        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }
//-------------------------------------------------------------

    public Node find(int key) {
        Node current = root;
        while (current.iData != key) {
            if (key < current.iData) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    } // end find()
//-------------------------------------------------------------

    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.iData = id;
        newNode.dData = dd;
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (id < current.iData) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } // end if go left
                else // or go right?
                {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }  // end else go right
            }  // end while
        }  // end else not root
    }  // end insert()
//-------------------------------------------------------------

    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }
//-------------------------------------------------------------

    public void preOrder(Node localRoot) {

        if (localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }
//-------------------------------------------------------------

    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }
//-------------------------------------------------------------

    public int getLeaves() {
        int count = 0;
        if (root == null) {
            return count;
        } else {
            Node current = new Node();
            Node last = new Node();
            current = root;
            while (current != null) {
                last = current;
                current = current.leftChild;
                if (current.rightChild == null && current.leftChild == null) {
                    count++;
                }
            }
            current = root;
            while (current != null) {
                last = current;
                current = current.rightChild;
                if (current.rightChild == null && current.leftChild == null) {
                    count++;
                }
            }
            return count;
        }
    }
//-------------------------------------------------------------

    public Node getRoot() {
        return root;
    }

}
/**
 *
 * @author Zabrina
 */
