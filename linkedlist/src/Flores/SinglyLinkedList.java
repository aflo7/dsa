package Flores;

// an implementation of a singly linked list

import java.util.Scanner;

public class SinglyLinkedList {

    private Node h;

    public SinglyLinkedList() {
        h = new Node();
        h._1 = null;
        h.next = null;

    }

    public boolean insert(Flores.Listing newListing) {
        Node n = new Node();
        if (n == null) {
            return false;
        } else {
            n.next = h.next;
            h.next = n;
            n._1 = newListing.deepCopy();
            return true;
        }
    }

    public Listing fetch(String targetKey) {
        Node p = h.next;

        while (p != null && !(p._1.compareTo(targetKey) == 0)) {
            p = p.next;
        }

        if (p != null) {
            return p._1.deepCopy();
        } else {
            return null;
        }

    }

    public boolean delete(String targetKey) {
        Node q = h;
        Node p = h.next;
        while (p != null && !(p._1.compareTo(targetKey) == 0)) {
            q = p;
            p = p.next;

        }
        if (p != null) {
            q.next = p.next;
            return true;
        } else {
            return false;
        }
    }

    public boolean update(String targetKey, Listing newListing) {
        if (delete(targetKey) == false) {
            return false;
        } else if (insert(newListing) == false) {
            return false;
        }
        return true;
    }
    
    public void showAll() {
        Node p = h.next;
        while (p != null) {
            System.out.println(p._1.toString());
            p = p.next;
        }
    }
    
    public int getChoice() {

        System.out.println("Enter: 1 to insert a new student's info");
        System.out.println("       2 to fetch and output a student's info");
        System.out.println("       3 to delete a student's info");
        System.out.println("       4 to update student's info");
        System.out.println("       5 to output everything in the database");
        System.out.println("       6 to exit the program");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println();

        int choice = myObj.nextInt();  // Read user input
        return choice;

    }

    public class Node {

        private Listing _1;
        private Node next;
        public Node() {

        }
    }
    
}
