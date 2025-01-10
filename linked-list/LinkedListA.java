import java.util.LinkedList;

public class LinkedListA {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<String>();

        names.add("Tamim");
        names.add("Ahasan");
        names.add("Rijon");
        // names.remove();
        // names.remove();
        // names.removeFirst();
        // names.removeLast();
        names.remove("Ahasan");

        System.out.println(names);
    }
}
