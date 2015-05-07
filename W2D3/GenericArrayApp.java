package w2d3;

/* Problem# 4 OUTPUT
Count number of CA is: 2
Count number of 10 is: 3
*/

public class GenericArrayApp {
    
    public static void main(String[] args) {
        
        GenericArray<String> text = new GenericArray<String>(6);
        text.push("CA");
        text.push("US");
        text.push("MX");
        text.push("HN");
        text.push("GT");
        text.push("CA");
        
        countOccurrences(text, "CA");
        
        GenericArray<Integer> nums = new GenericArray<Integer>(6);
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        nums.push(10);
        nums.push(10);
        
        countOccurrences(nums, 10);
    }
}
/**
 *
 * @author ZBrodale
 */