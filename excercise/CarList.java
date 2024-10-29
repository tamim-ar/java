import java.util.LinkedList;

public class CarList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove();
        cars.add("Rolls");
        cars.remove();
        System.out.println(cars);

        LinkedList<String> queue = new LinkedList<>();

        // Adding customers to the queue
        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");
        queue.add("Customer 4");
        queue.remove();

        System.out.println("Current queue: " + queue);
    }
}