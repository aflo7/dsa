/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flores;

/**
 *
 * @author andres
 */
public class Student {
   String name;
   int id;
   double gpa;
   
   public Student(String name, int id, double gpa) {
       this.name = name;
       this.id = id;
       this.gpa = gpa;
   }
   
   public Student deepCopy() {
        Student copy = new Student(this.name, this.id, this.gpa);
        return copy;
    }
   
   
   @Override
   public String toString() {
       return "[" + this.name + " " + this.id + " " + this.gpa + "]";
   }
}
