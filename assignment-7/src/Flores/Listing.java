
package Flores;

// name, id, gpa
// sort by id for now. need to sort by name

public class Listing {
    String name;
    int id;
    double gpa;
    
    // define children
    Listing left;
    Listing right;
    
    Listing(String name, int id, double gpa){
        this.name = name;
        this.gpa = gpa;
        this.id = id;
        left = null;
        right = null;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getGPA() {
        return this.gpa;
    }
}
