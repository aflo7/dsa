package Flores;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    Listing root;

    BinaryTree() {
        root = null;
    }

    public Listing createNewListing() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        System.out.println("Enter gpa: ");
        double gpa = sc.nextDouble();

        return new Listing(name, id, gpa);
    }

    public void insert(Listing L) {
        root = insertHelper(root, L.getName(), L.getID(), L.getGPA());
    }

    private Listing insertHelper(Listing current, String name, int id, double gpa) {
        if (current == null) {
            return new Listing(name, id, gpa);
        }

        if (name.compareTo(current.getName()) < 0) {
            current.left = insertHelper(current.left, name, id, gpa);

        } else if (name.compareTo(current.getName()) > 0) {
            current.right = insertHelper(current.right, name, id, gpa);

        } else {
            return current;
        }

        return current;
    }

    // find node by name
    public boolean findNode(Listing node) {
        return findNodeHelper(root, node.getName());
    }

    public boolean findNodeHelper(Listing current, String name) {
        if (current == null) {
            return false;
        }
        if (name.compareTo(current.getName()) == 0) {
            return true;
        }
        if (name.compareTo(current.getName()) < 0) {
            return findNodeHelper(current.left, name);
        } else {
            return findNodeHelper(current.right, name);
        }

    }

    // find node by name and then update
    public boolean findNodeAndUpdate(Listing node, String newName, int newID, double newGPA) {
        return findNodeAndUpdateHelper(root, node.getName(), newName, newID, newGPA);
    }

    public boolean findNodeAndUpdateHelper(Listing current, String name, String newName, int newID, double newGPA) {
        if (current == null) {
            return false;
        }
        if (name.compareTo(current.getName()) == 0) {
            current.setName(newName);
            current.setID(newID);
            current.setGPA(newGPA);
            return true;
        }
        if (name.compareTo(current.getName()) < 0) {
            return findNodeAndUpdateHelper(current.left, name, newName, newID, newGPA);
        } else {
            return findNodeAndUpdateHelper(current.right, name, newName, newID, newGPA);
        }

    }

    // delete by name
    public void delete(Listing node) {
        root = deleteRecursive(root, node.getName());
    }

    private Listing deleteRecursive(Listing current, String name) {
        if (current == null) {
            return null;
        }

        // element to be deleted is found
        if (name.compareTo(current.getName()) == 0) {
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
            String smallestValue = findSmallestValue(current.right);
            current.name = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (name.compareTo(current.getName()) < 0) {
            current.left = deleteRecursive(current.left, name);
        }
        current.right = deleteRecursive(current.right, name);

        return current;
    }

    private String findSmallestValue(Listing root) {
        return root.left == null ? root.getName() : findSmallestValue(root.left);
    }

    // in order depth first search
    public void inOrderDFS(Listing node) {
        if (node != null) {
            inOrderDFS(node.left);
            System.out.print("[Name: " + node.getName() + ", ID: " + node.getID() + "GPA: " + node.getGPA() + "]");
            System.out.println();
            inOrderDFS(node.right);
        }
    }

    public void BFS() {
        if (this.root == null) {
            return;
        }

        Queue<Listing> nodes = new LinkedList<>();

        nodes.add(this.root);

        while (!nodes.isEmpty()) {

            Listing node = nodes.remove();

            System.out.print("Name: " + node.getName());
            System.out.println();

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }
}
