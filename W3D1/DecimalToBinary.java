package cs221.W3D1;

import java.util.ArrayList;

/**
 *  Creates a DecimalToBinary object with convert().
 */

public class DecimalToBinary {
   
    ArrayList<Integer> theStack;
    int remainder;
    int value;
    String output;
    
    public DecimalToBinary() {
        theStack = new ArrayList<Integer>();
    }
    
    public String convert(int input) {
        if (input == 0) {
            output = "";
            for(int i = theStack.size() - 1; i >= 0; i--){
                output = output + theStack.remove(i);
            }
            return output;
        } else {
            value = input / 2;
            remainder = input - (value*2);
            theStack.add(remainder);
            return convert(value);
        }
    }
}
/**
 *
 * @author Zabrina
 */