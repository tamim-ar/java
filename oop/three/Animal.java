package oop.three;

abstract public class Animal {
    abstract void walk();

    public void eat() {
        System.out.println("Eat.");
    }
    Animal(){
        System.out.println("Creating a animal.");
    }
}
