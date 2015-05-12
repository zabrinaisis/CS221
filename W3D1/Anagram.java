package cs221.W3D1;

import java.util.Arrays;

/**
 *  Creates an Anagram object that has method isAnagram().
 */

public class Anagram {
   
    String s1;
    String s2;
    char[] c1;
    char[] c2;

    public Anagram(String s1, String s2)
    {
        this.s1 = s1;
        this.s2 = s2;
        c1 = new char[s1.length()];
        c2 = new char[s2.length()];
    }
    
    public boolean isAnagram()
    {
        if (s1.length() != s2.length()) {
            return false;
        }
     
        for (int i = 0; i < s1.length(); i++) {
            c1[i] = s1.charAt(i);
        }
        
        for (int j = 0; j < s2.length(); j++) {
            c2[j] = s2.charAt(j);
        }
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        return Arrays.equals(c1, c2);
    }
    
            
}
/**
 *
 * @author Zabrina
 */
