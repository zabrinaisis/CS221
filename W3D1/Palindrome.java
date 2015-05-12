package cs221.W3D1;

/**
 * Creates a Palindrome object and uses isPalindrome method.
 */

public class Palindrome {

    String input;
    int size;
    int stop;
    char[] theArray;

    public Palindrome(String in) {
        input = in;
        size = input.length();
        theArray = new char[size];
        stop = size / 2;
        for (int i = 0; i < size; i++) {
            theArray[i] = input.charAt(i);
        }
    }

    public boolean isPalindrome(int start, int end) {

        if (start == stop + 1) {
            return true;
        } else {
            if (theArray[start] == theArray[end]) {
                return isPalindrome(start + 1, end - 1);
            } else {
                return false;
            }

        }

    }

}
/**
 *
 * @author Zabrina
 */
