package cs221.W3D1;

/** Problem# 2 OUTPUT
Binary for decimal 5: 101
Binary for decimal 233: 11101001
Binary for decimal 2: 10
Binary for decimal 10: 1010
Binary for decimal 2056782: 111110110001001001110
**/

public class DecimalToBinaryApp {
    
    public static void main(String[] args) {
        
        DecimalToBinary num = new DecimalToBinary();
        System.out.println("Binary for decimal 5: " + num.convert(5));
        System.out.println("Binary for decimal 233: " + num.convert(233));
        System.out.println("Binary for decimal 2: " + num.convert(2));
        System.out.println("Binary for decimal 10: " + num.convert(10));
        System.out.println("Binary for decimal 2056782: " + num.convert(2056782));
    }
    
}
/**
 *
 * @author Zabrina
 */
