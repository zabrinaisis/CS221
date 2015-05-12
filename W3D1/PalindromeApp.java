package cs221.W3D1;

/** Problem# 3 OUTPUT
The word 'racecar' is a Palindrome? true
The word 'hello' is a Palindrome? false
**/

public class PalindromeApp {
    public static void main(String[] args) {
        Palindrome p1 = new Palindrome("racecar");
        Palindrome p2 = new Palindrome("hello");
        System.out.println("The word 'racecar' is a Palindrome? " + p1.isPalindrome(0, 6));
        System.out.println("The word 'hello' is a Palindrome? " + p2.isPalindrome(0, 4));
    }
}
/**
 *
 * @author Zabrina
 */