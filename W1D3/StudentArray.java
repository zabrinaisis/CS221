package w1d3;

public class StudentArray {

    private Student[] a;                        // reference to array
    private int nElems;                         // number of data items
//--------------------------------------------------------------    

    public StudentArray(int max) {              // constructor
        a = new Student[max];
        nElems = 0;
    }
//--------------------------------------------------------------

    public Student find(int id) {

        int j;

        for (j = 0; j < nElems; j++) {              // for each element,
            if (a[j].getId() == id) {               // found item?
                break;                              // exit loop before end
            }
        }

        if (j == nElems) {                          // gone to end?
            return null;                            // yes, can't find it
        } else {
            return a[j];                            // no, found it
        }

    }  // end find()
//--------------------------------------------------------------                                    

    public void insert(int id, String name, int mark) { // put student into array at last position

        int j;

        for (j = 0; j < nElems; j++) {              // for each element,
            if (a[j].getId() == id) {               // found item?
                break;                              // exit loop before end
            }
        }

        if (j == nElems) {
            a[nElems] = new Student(id, name, mark);// can't find it
            nElems++;                               // increment size
        } else {
            System.out.println("ID already assigned to another student.");
        }
    }
//--------------------------------------------------------------

    public boolean delete(int id) {                 // delete student from array

        int j;

        for (j = 0; j < nElems; j++) {              // look for it
            if (a[j].getId() == id) {
                break;
            }
        }

        if (j == nElems) {                          // can't find it
            return false;
        } else {                                    // found it
            for (int k = j; k < nElems; k++) {      // shift down
                a[k] = a[k + 1];
            }
            nElems--;                               // decrement size
            return true;
        }
    }
//--------------------------------------------------------------

    public void displayAll() {                      // displays array contents
        for (int j = 0; j < nElems; j++) {          // for each element,
            a[j].displayStudent();                  // display it
        }
    }
//--------------------------------------------------------------

    public int theMark(int i) {
        int grade = a[i].getMark();
        return grade;
    }
//--------------------------------------------------------------

    public String theName(int i) {
        String name = a[i].getName();
        return name;
    }

////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        int maxSize = 100;                          // array size
        StudentArray arr;                           // reference to array
        arr = new StudentArray(maxSize);            // create the array
//--------------------------------------------------------------       

        arr.insert(50, "Patty Evans", 4);           // insert 10 items
        arr.insert(51, "Lorraine Smith", 3);
        arr.insert(52, "Tom Yee", 4);
        arr.insert(53, "Henry Adams", 3);
        arr.insert(54, "Sato Hashimoto", 2);
        arr.insert(55, "Henry Stimson", 2);
        arr.insert(56, "Jose Velasquez", 2);
        arr.insert(57, "Henry Lamarque", 8);
        arr.insert(58, "Minh Vang", 2);
        arr.insert(59, "Lucinda Creswell", 1);

        arr.displayAll();                           // display items
        System.out.println();

//--------------------------------------------------------------               
        int searchKey = 55;                         // search for item
        Student found;
        found = arr.find(searchKey);

        if (found != null) {
            System.out.print("Found ");
            found.displayStudent();
        } else {
            System.out.println("Can't find " + searchKey);
        }
        System.out.println();
//--------------------------------------------------------------  

        int highGrade = 0;
        int lowGrade = 100;
        int[] tempArr = new int[maxSize];

        for (int i = 0; i < arr.nElems; i++) {
            tempArr[i] = arr.theMark(i);
        }        

        for (int k = 0; k < arr.nElems; k++) {
            if (tempArr[k] < lowGrade) {
                lowGrade = tempArr[k];
            }
            if (tempArr[k] > highGrade) {
                highGrade = tempArr[k];
            }
        }

        for (int l = 0; l < arr.nElems; l++) {
            if (arr.theMark(l) == lowGrade) {
                System.out.println("The student with the lowest grade was: " + arr.theName(l));
            }
            if (arr.theMark(l) == highGrade) {
                System.out.println("The student with the highest grade was: " + arr.theName(l));
            }
        }
        
        System.out.println();
//--------------------------------------------------------------

        System.out.println("Deleting ID#'s 52, 53, and 54.");
        arr.delete(52);                             // delete 3 items
        arr.delete(53);
        arr.delete(54);

        System.out.println();
        arr.displayAll();                           // display items again        

    }  // end main()

}  // end class StudentArray

/**
 *
 * @author Zbrodale
 */
