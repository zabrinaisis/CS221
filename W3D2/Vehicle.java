package cs221.W3D2;

import java.util.Set;
import java.util.TreeSet;

/** Problem# 2: Vehicle object with TreeSet and compareTo(). **/

public class Vehicle implements Comparable {

    String name;
    Double price;
    String model;
    Set<String> theTree;

    public Vehicle(String name, Double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
        theTree = new TreeSet<String>();
        theTree.add(this.model);
    }

    public int compareTo(Object obj) {
        Vehicle theCar = (Vehicle) obj;
        if (this.price > theCar.price) {
            return 1;
        } else if (this.price < theCar.price) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
/**
 *
 * @author Zabrina
 */
