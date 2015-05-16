package cs221.W3D5;

/** Creates a DataItem object.
 **/

public class DataItem {

    private int iData;                         // data item (key)
//--------------------------------------------------------------

    public DataItem(int ii)                    // constructor
    {
        iData = ii;
    }
//--------------------------------------------------------------

    public int getKey()
    {
        return iData;
    }

}  // end class DataItem    

/**
 *
 * @author Zabrina
 */
