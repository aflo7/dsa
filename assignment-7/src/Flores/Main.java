
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
        
         Listing root = new Listing("R", -5, 2.6);
        Listing andres = new Listing("Andres", 0, 2.2);
        Listing angel = new Listing("Angel", -10, 3.0);
        Listing mark = new Listing("Mark", 2, 3.2);
        Listing gabby = new Listing("Gabby", -100, 3.0);
        Listing chloe = new Listing("chloe", 66, 3.2);
        Listing harry = new Listing("harry", 200, 1.0);
        
        
        // create the root node
        BinaryTree db = new BinaryTree(root);
        db.insert(andres);
        db.insert(angel);
        db.insert(mark);
        db.insert(gabby);
        db.insert(chloe);
        
        // print in order (least to greatest ID
        db.DFS(db.root);
        
        
        // check to see if id "200" is in the binary tree
        System.out.println("Expect: false, " + "Result: " + db.findNode(harry));
        // check to see if id "66" is in the binary tree
        System.out.println("Expect: true, " + "Result: " + db.findNode(chloe));
        
        
        // delete node "Mark"
        System.out.println("---------------");
        System.out.println("Before deletion");
        db.DFS(db.root);
        System.out.println("---------------");
        db.delete(mark);
        System.out.println("After deletion");
        db.DFS(db.root);
        System.out.println("---------------");
        
        
                
    }
    
}
