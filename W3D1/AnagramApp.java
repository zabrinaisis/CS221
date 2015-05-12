package cs221.W3D1;

/* Problem# 4 OUTPUT
The words 'silent' and 'listen' are anagrams? true
The words 'hello' and 'laugh' are anagrams? false
*/

public class AnagramApp {
    
    public static void main(String[] args) {
        Anagram words = new Anagram("silent", "listen");
        System.out.println("The words 'silent' and 'listen' are anagrams? " + words.isAnagram());
        Anagram otherWords = new Anagram("hello", "laugh");
        System.out.println("The words 'hello' and 'laugh' are anagrams? " + otherWords.isAnagram());
    }
}
/**
 *
 * @author Zabrina
 */