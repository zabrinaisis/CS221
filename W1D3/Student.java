package w1d3;

public class Student {

    private int id;
    private String name;
    private int mark;
//--------------------------------------------------------------

    public Student(int id, String name, int mark) { // constructor to initialize the values
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
//--------------------------------------------------------------

    public void displayStudent() {
        System.out.println(id + ": " + name + ", received a " + mark + ".");
    }
//--------------------------------------------------------------

    public int getId() {                            // get the Id
        return id;
    }
    
    public String getName() {                            // get the Id
        return name;
    }
    
    public int getMark() {                            // get the Id
        return mark;
    }

}  // end class Student

/**
 *
 * @author Zbrodale
 */
