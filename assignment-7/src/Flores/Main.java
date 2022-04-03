
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
        
         Listing root = new Listing("Apple", -5, 2.6);
        Listing andres = new Listing("Andres", 0, 2.2);
        Listing angel = new Listing("Angel", -10, 3.0);
        Listing mark = new Listing("Mark", 2, 3.2);
        Listing gabby = new Listing("Gabby", -100, 3.0);
        Listing chloe = new Listing("chloe", 66, 3.2);
        
        
        // create the root node
        BinaryTree db = new BinaryTree(root);
        db.insert(andres);
        db.insert(angel);
        db.insert(mark);
        db.insert(gabby);
        db.insert(chloe);
        
        
        db.DFS(db.root);
    }
    
}
