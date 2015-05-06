package w2d3;

/** Problem# 2
 *  Generic Link with one data value.
 */

public class GenericLink<T> {

    public T data;
    public GenericLink next;
//-------------------------------------------------------------

    public GenericLink(T d)
    {
        data = d;
    }
//-------------------------------------------------------------

    public void displayLink()
    {
        System.out.print(data + " ");
    }
}
/**
 *
 * @author Zbrodale
 */
