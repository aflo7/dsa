package Flores;

import java.util.Scanner;
import javax.print.attribute.standard.MediaSize;

public class Main {

    public static void main(String[] args) {
        BinaryTree db = new BinaryTree();

        boolean keepGoing = true;

        while (keepGoing) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter: 1 to insert a new student's information");
            System.out.println("       2 to fetch and output a student's information");
            System.out.println("       3 to delete a student's information");
            System.out.println("       4 to update a student's information");
            System.out.println("       5 to output all the student information in descending order");
            System.out.println("       6 to exit the program");

            int choice = sc.nextInt();
            if (choice == 6) {
                keepGoing = false;
            } else if (choice == 1) {

                Listing newListing = db.createNewListing();
                db.insert(newListing);
            } else if (choice == 2) {

                Listing findMe = db.createNewListing();
                if (db.findNode(findMe)) {
                    System.out.println("Listing found");
                }
            } else if (choice == 5) {
                db.inOrderDFS(db.root);
            } else if (choice == 3) {
                Listing deleteMe = db.createNewListing();
                db.delete(deleteMe);
            } else if (choice == 4) {
                System.out.println("Enter name: ");
                System.out.println("Enter age: ");
                System.out.println("Enter gpa: ");
                
                Listing updateMe = db.createNewListing();
            }
         }
    }

}
