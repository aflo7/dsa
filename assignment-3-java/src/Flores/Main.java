package Flores;

public class Main {

    public static void main(String[] args) {
        StudentStack db = new StudentStack(5);

        Student a = new Student("Andres", 21, 3.5);
        Student b = new Student("Carlos", 21, 3.5);
        Student c = new Student("Steve", 21, 3.5);
        Student d = new Student("Bob", 21, 3.5);
        Student e = new Student("Chris", 21, 3.5);

        db.push(a);
        db.push(b);
        db.push(c);
        db.push(d);
        db.push(e);
        db.printStack();
        db.getCapacity();
        System.out.println(db.peek());

        db.pop();
        db.printStack();
        db.getCapacity();
        System.out.println(db.peek());

        db.pop();
        db.printStack();
        db.getCapacity();
        System.out.println(db.peek());

        db.printStack();
        db.getCapacity();
        
        db.increaseSizeByThree();
        db.getCapacity();
        db.printStack();
    }

}
