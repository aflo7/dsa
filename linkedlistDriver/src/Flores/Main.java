
package Flores;
/**
 *
 * @author andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinglyLinkedList db = new SinglyLinkedList();
        Listing l1 = new Listing("Andres", "1", "2.2");
        Listing l2 = new Listing("Shane", "2", "3.0");
        Listing l3 = new Listing("Ryan", "3", "3.2");

        //test insert
        db.insert(l3);
        db.insert(l2);
        db.insert(l1);
        db.showAll();
        System.out.println();

        // test fetch of Shane
        l2 = db.fetch("Shane");
        System.out.println(l2.toString());
        System.out.println();

        //test delete of Ryan
        db.delete("Ryan");
        db.showAll();
        System.out.println();

        // update Andres to ANDRES
        Listing l4 = new Listing("ANDRES", "1", "2.8");
        db.update("Andres", l4);
        db.showAll();
    }
    
}
