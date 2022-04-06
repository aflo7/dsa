package Flores;

import java.util.ArrayList;

/**
 *
 * @author andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Listing a = new Listing("a", 6, 2.6);
        Listing b = new Listing("b", 4, 2.2);
        Listing c = new Listing("c", 8, 3.0);
        Listing d = new Listing("d", 3, 3.2);
        Listing e = new Listing("e", 5, 3.0);
        Listing f = new Listing("f", 9, 3.2);
        Listing g = new Listing("g", 0, 1.0);
        Listing h = new Listing("h", 7, 3.2);
        Listing i = new Listing("i", 7, 3.2);

        // create the root node
        BinaryTree db = new BinaryTree();
        
        Listing arr[] = new Listing[]{a, b, c, d, e, f, g};
        
        db.insert(b);
        db.insert(c);
        db.insert(d);
        db.insert(e);
        db.insert(a);
        
        db.insert(f);
        db.insert(g);

        // print with BFS
        System.out.println("traversing with breadth first search...");
        db.BFS();
        System.out.println();

        // print in order DFS
        System.out.println("traversing with in order depth first search...");
        db.inOrderDFS(db.root);
        System.out.println();

        // check to see if "h" is in the binary tree
        System.out.println("Expect: false, " + "Result: " + db.findNode(h));
        // check to see if "c" is in the binary tree
        System.out.println("Expect: true, " + "Result: " + db.findNode(c));

        // delete node "Mark"
        System.out.println("---------------");
        System.out.println("Before deletion of e");
        db.inOrderDFS(db.root);
        System.out.println("---------------");
        db.delete(e);
        System.out.println("After deletion");
        db.inOrderDFS(db.root);
        System.out.println("---------------");

    }

}
