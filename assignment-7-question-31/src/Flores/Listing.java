package Flores;

import java.util.Scanner;

public class Listing {

    String name;
    int id;
    double gpa;

    // define children
    Listing left;
    Listing right;

    Listing(String name, int id, double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
        left = null;
        right = null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getGPA() {
        return this.gpa;
    }
}
