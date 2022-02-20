// feb 19, 2022
package Flores;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {


        SinglyLinkedList db = new SinglyLinkedList();
        int choice = 0;

        while (choice != 6) {

            choice = db.getChoice();
            if (choice == 1) { //insert a node
                Listing n = new Listing();
                n.input();
                db.insert(n);
                System.out.println("Operation complete.");
            } else if (choice == 2) { // fetch and output a node
                String f = JOptionPane.showInputDialog("Enter name: ");
                Listing fetchMe = db.fetch(f);
                System.out.println(fetchMe.toString());
                System.out.println("Operation complete.");
            } else if (choice == 3) {
                String d = JOptionPane.showInputDialog("Enter name: ");
                db.delete(d);
                System.out.println("Operation complete.");
            } else if (choice == 4) {
                System.out.println("Who would you like to replace? ");
                String replace = JOptionPane.showInputDialog("Enter name: ");

                if (db.fetch(replace) != null) {
                    Listing u = new Listing();
                    u.input();
                    db.update(replace, u);
                    System.out.println("Operation complete.");
                } else {
                    System.out.println("Node not found.");
                }

            } else if (choice == 5) {
                db.showAll();
                System.out.println("Operation complete.");
            }

        }

    }

}
