package cs221.W3D1;

/** Problem# 1 OUTPUT
linearSearch(list, 55): true
linearSearch(list, 50): true
linearSearch(list, 22): true
**/

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {22, 33, 44, 55, 66, 77};
        System.out.println("linearSearch(list, 55): " + linearSearch(list, 55, 0));
        System.out.println("linearSearch(list, 50): " + linearSearch(list, 55, 0));
        System.out.println("linearSearch(list, 22): " + linearSearch(list, 55, 0));
    }
    
    public static boolean linearSearch(int[] l, int target, int num) {
        if (target == l[num]) {
            return true;
        } else {
            return linearSearch(l, target, num+1);
        }
    }
}
/**
 *
 * @author Zabrina
 */

