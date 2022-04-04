package Flores;
// order by name?

public class BinaryTree {

    Listing root;

    // define root in constructor
    BinaryTree(Listing root) {
        this.root = root;
    }

    public void insert(Listing L) {
        root = insertHelper(root, L.getName(), L.getID(), L.getGPA());
    }

    private Listing insertHelper(Listing current, String name, int id, double gpa) {
        if (current == null) {
            return new Listing(name, id, gpa);
        }

        if (id < current.getID()) {
            current.left = insertHelper(current.left, name, id, gpa);

        } else if (id > current.getID()) {
            current.right = insertHelper(current.right, name, id, gpa);

        } else {
            return current;
        }

        return current;
    }

    // find node by ID
    public boolean findNode(Listing node) {
        return findNodeHelper(root, node.getID());
    }

    public boolean findNodeHelper(Listing current, int id) {
        if (current == null) {
            return false;
        }
        if (id == current.getID()) {
            return true;
        }
        if (id < current.getID()) {
            return findNodeHelper(current.left, id);
        } else {
            return findNodeHelper(current.right, id);
        }

    }
    
    // delete by ID
    public void delete(Listing node) {
        root = deleteRecursive(root, node.getID());
    }

    private Listing deleteRecursive(Listing current, int id) {
        if (current == null) {
            return null;
        }

        // element to be deleted is found
        if (id == current.getID()) {
            // case 1: node is a leaf
            if (current.left == null && current.right == null) {
                return null;
            }
            // case 2: node has 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // case 3: node has 2 children
            int smallestValue = findSmallestValue(current.right); 
            current.id = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (id < current.getID()) {
            current.left = deleteRecursive(current.left, id);
        }
        current.right = deleteRecursive(current.right, id);

        return current;
    }

    private int findSmallestValue(Listing root) {
        return root.left == null ? root.getID() : findSmallestValue(root.left);
    }

    // in order depth first search
    public void DFS(Listing node) {
        if (node != null) {
            DFS(node.left);
            System.out.print(" " + node.getName() + ": ID " + node.getID());
            System.out.println();
            DFS(node.right);
        }
    }
}
