package w1d5;

/**
 *  Admissions object class.
 */

public class Admission {
    
    int adno; // Admission number 
    String name; // Name of the student
    String pno;  // Phone number
    static int nums = 100000;

    public Admission(String name, String pno) {
        ++nums;
        this.adno = nums;
        this.name = name;
        this.pno = pno;
    }
    
    @Override
    public String toString() {
        String record = adno + ": " + name + ", " + pno;
        return record;
    }
    
    public int getAdno() {
        return adno;
    }
    
}
/**
 *
 * @author ZBrodale
 */
