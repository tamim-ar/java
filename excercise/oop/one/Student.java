package oop.one;

public class Student {
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student student2) {
        System.out.println("Constructor Called.");
        this.name = student2.name;
        this.age = student2.age;
    }

    Student(){
        
    }
}
