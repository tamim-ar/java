package oop.one;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "Gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "blue";
        pen2.type = "ball";
        pen2.write();

        Student student1 = new Student();
        student1.name = "Tamim";
        student1.age = 22;
        student1.printName();

        Student student2 = new Student(student1);
        student2.printName();
    }
}
