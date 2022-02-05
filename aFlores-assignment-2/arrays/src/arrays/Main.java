/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentListings db = new StudentListings();
        
        System.out.println("Expect: Length 0, Result: Length " + db.getArrLength());
        db.printArr(); // should print nothing, as the array is empty

        // append a new student to end of db
        StudentNode andres = new StudentNode("Andres", 101, 4.0);
        db.appendItem(andres);
        System.out.println("Expect: Length 1, Result: Length " + db.getArrLength());
        db.printArr();

        // append another student to end of db
        StudentNode jeff = new StudentNode("Jeff", 102, 3.0);
        db.appendItem(jeff);
        System.out.println("\nExpect: Length 2, Result: Length " + db.getArrLength());
        db.printArr();
        
        
        // print arr with 2 items
        System.out.println();
        db.printArr();
        
        // insert at index 0
        StudentNode mary = new StudentNode("Mary", 103, 3.5);
        db.insertAtIndex(0, mary);
        db.printArr();
        
        // insert at index 1
        StudentNode susan = new StudentNode("Susan", 104, 3.2);
        db.insertAtIndex(1, susan);
        db.printArr();
        
        // insert at index 0
        StudentNode marc = new StudentNode("Marc", 105, 2.5);
        db.insertAtIndex(0, marc);
        db.printArr();
        
        
       // delete at index 1
       System.out.println("\nDeleting index 1...");
       db.deleteAtIndex(1);
       db.printArr();
       
       
       // delete at index 3
       System.out.println("\nDeleting index 3...");
       db.deleteAtIndex(3);
       db.printArr();
        

    }

}
