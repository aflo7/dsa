package Flores;

import javax.swing.JOptionPane;

public class Listing {

    private String name;
    private String ID;
    private String gpa;

    public Listing() {

    }

    public Listing(String name, String id, String gpa) {
        this.name = name;
        this.ID = id;
        this.gpa = gpa;
    }

    public String toString() {
        return "[" + name + ", " + ID + ", " + gpa + "]";
    }

    public Listing deepCopy() {
        Listing clone = new Listing(name, ID, gpa);
        return clone;
    }
    
    public int compareTo(String targetKey) {
        return(name.compareTo(targetKey));
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public void input() {
        name = JOptionPane.showInputDialog("Enter name: ");
        ID = JOptionPane.showInputDialog("Enter ID: ");
        gpa = JOptionPane.showInputDialog("Enter gpa: ");
    }
}
