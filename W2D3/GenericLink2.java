package w2d3;

/** Problem# 3
 *  Generic Link with two data values.
 */

public class GenericLink2<T> {
    
    public T data1;
    public T data2;
    public GenericLink2 next;
//-------------------------------------------------------------

    public GenericLink2(T d1, T d2)
    {
        data1 = d1;
        data2 = d2;
    }
//-------------------------------------------------------------

    public void displayLink()
    {
        System.out.print(data1 + " " + data2 + " ");
    }
    
}
/**
 *
 * @author ZBrodale
 */
