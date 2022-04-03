package Flores;

public class BinaryTree {

    Listing root;

    // define root in constructor
    BinaryTree(Listing root) {
        this.root = root;
    }

    public void insert(Listing L) {
        root = insertHelper(root, L.getName(), L.getID(), L.getGPA());
    }

    public Listing insertHelper(Listing current, String name, int id, double gpa) {
       if (current == null) {
           return new Listing(name, id, gpa);
       }
       
       if (id < current.getID()) {
           current.left = insertHelper(current.left, name, id, gpa);
           System.out.println("add left");
       } else if (id > current.getID()) {
           current.right = insertHelper(current.right, name, id, gpa);
           System.out.println("add right");
       } else {
           return current;
       }
       
       return current;
    }

    public void DFS(Listing node) {
        if (node != null) {
            DFS(node.left);
            System.out.print(" " + node.getID());
            DFS(node.right);
        }
    }
}
