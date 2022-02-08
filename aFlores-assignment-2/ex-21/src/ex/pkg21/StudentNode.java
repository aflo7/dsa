/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg21;

/**
 *
 * @author andres
 */
public class StudentNode {
    String name;
    int id;
    double gpa;

    public StudentNode(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public StudentNode deepCopy() {
        StudentNode copy = new StudentNode(this.name, this.id, this.gpa);
        return copy;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + " " + Integer.toString(id) + " " + Double.toString(gpa);
    }
}
