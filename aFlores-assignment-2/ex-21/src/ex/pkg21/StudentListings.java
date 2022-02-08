/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg21;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class StudentListings {

    StudentNode[] studentArr = new StudentNode[0];

    public int getArrLength() {
        return studentArr.length;
    }

    public void appendItem(StudentNode appendMe) {

        int currSize = studentArr.length;

        // instantiate a new arr with size + 1
        StudentNode[] newArr = new StudentNode[currSize + 1];

        int i;
        for (i = 0; i < currSize; i++) {
            newArr[i] = studentArr[i];

        }
        newArr[currSize] = appendMe;
        studentArr = newArr;

    }

    public void replaceAtIndex(int position, StudentNode insertMe) {
        if (position < 0) {
            return;
        }

        studentArr[position] = insertMe;
    }

    public void insertAtIndex(int position, StudentNode insertMe) {
        int currSize = studentArr.length;

        // instantiate a new arr with size + 1
        StudentNode[] result = new StudentNode[currSize + 1];

        for (int i = 0, j = 0; i < studentArr.length; i++, j++) {
            if (i == position) {
                result[j] = insertMe;
                j++;
            }
            result[j] = studentArr[i];

        }

        studentArr = result;

    }

    public void deleteAtIndex(int index) {
        int currSize = studentArr.length;

        if (currSize == 0 || index < 0 || index >= currSize) {
            System.out.println("Invalid index");
            return;
        }

        StudentNode[] newArr = new StudentNode[currSize - 1];

        for (int i = 0, j = 0; i < currSize; i++) {
            if (i == index) {
                continue;
            }

            newArr[j++] = studentArr[i];
        }

        this.studentArr = newArr;

    }

    public void printStudent(int index) {

        try {
            System.out.println(studentArr[index]);
        } catch (Exception e) {
            System.out.println("Null index");
        }

    }

    public void printArr() {

        if (studentArr == null) {
            return;
        }

        for (int i = 0; i < studentArr.length; i++) {

            System.out.print("[" + studentArr[i].toString() + "]");
        }
        System.out.println();
    }

    public void MainLoop(StudentListings db) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        boolean c = true;
        while (c) {

            int choice;
            System.out.println();
            System.out.println("Enter 1 to insert a new student");
            System.out.println("Enter 2 to fetch a student");
            System.out.println("Enter 3 to delete a student");
            System.out.println("Enter 4 to update a student");
            System.out.println("Enter 5 to output all students");
            System.out.println("Enter 6 to exit the program");

            choice = reader.nextInt();

            System.out.println("your choice was " + choice);

            if (choice == 6) {
                c = false;
                System.out.println("Exiting...");
            } else if (choice == 5) {
                if (db.getArrLength() == 0) {
                    System.out.println("Database is empty");
                    continue;
                }
                db.printArr();
            } else if (choice == 4) {

                String name;
                int id;
                double gpa;
                int position;

                System.out.println("Replace at index: ");
                position = reader.nextInt();

                System.out.println("Enter name: ");
                name = reader.next();

                System.out.println("Enter id: ");
                id = reader.nextInt();

                System.out.println("Enter gpa: ");
                gpa = reader.nextDouble();

                StudentNode replacement = new StudentNode(name, id, gpa);

                db.replaceAtIndex(position, replacement);
            } else if (choice == 3) {
                System.out.println("Enter index to delete: ");
                int index = reader.nextInt();
                db.deleteAtIndex(index);
            } else if (choice == 2) {
                System.out.println("Enter index to display: ");
                int idx = reader.nextInt();
                db.printStudent(idx);

            } else if (choice == 1) {
                String name;
                int id;
                double gpa;

                System.out.println("Enter name: ");
                name = reader.next();

                System.out.println("Enter id: ");
                id = reader.nextInt();

                System.out.println("Enter gpa: ");
                gpa = reader.nextDouble();

                StudentNode appendMe = new StudentNode(name, id, gpa);
                db.appendItem(appendMe);
            }

        }
    }

}
