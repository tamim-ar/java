// Java program to add elements to a LinkedList
import java.util.LinkedList;

public class AddElements {

    // Main driver method
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        // Printing the LinkedList
        System.out.println(l);
    }
}