package cs221.W3D5;

/** Creates a StringDataItem object.
 **/

public class StringDataItem {

    private String iData;                               // data item (key)
    private int intData;
//--------------------------------------------------------------

    public StringDataItem(String input)                       // constructor
    {
        iData = input;
    }
//--------------------------------------------------------------

    public int getKey()
    {
        intData = iData.hashCode();
        return intData;
    }
//--------------------------------------------------------------

    public String getValue()
    {
        return iData;
    }    

}  // end class DataItem    

/**
 *
 * @author Zabrina
 */
