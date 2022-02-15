package Flores;

// import java.util.Stack;
// this stack has a fixed capacity. used primitive array to create a basic stack
// LIFO
public class StudentStack {

    private Student[] data; // store students here
    private int top;
    private int size;

    public StudentStack() {
        top = -1;
        size = 100;
        data = new Student[100];
    }

    public StudentStack(int n) {
        top = -1;
        size = n;
        data = new Student[n];
    }

    public boolean push(Student s) {

        if (this.isFull()) {
            return false;
        }

        top = top + 1;
        data[top] = s;
        System.out.println("successfully added");
        return true;
    }

    public Student pop() {

        if (this.isEmpty()) {
            return null;
        }
        int topLocation = top;
        top = top - 1;
        return data[topLocation];
    }

    public void printStack() {
        System.out.println();
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].toString());
        }
    }

    public void getCapacity() {
        System.out.println("Capacity: " + data.length);
    }

    // empties stack to originally defined size
    public void emptyStack() {
        data = new Student[size];
    }

    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("underflow error");
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == size - 1) {
            System.out.println("overflow error");
            return true;
        }
        return false;
    }
    
    // peek the top of stack without deleting
    public String peek() {
        if (this.isEmpty()) {
            return "Stack is empty";
        } else {
              return data[top].toString();
           
        }
    }
    
    public void increaseSizeByThree() {
        Student[] tempArr = data;
        
        data = new Student[size + 3];
        
        for (int i = top; i >= 0; i--) {
            if (tempArr[i] != null) {
                data[i] = tempArr[i];
            }
        }
        
        System.out.println("Increased stack size by 3");
        
    }

}
