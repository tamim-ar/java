public class exception {
    public static void main(String[] args) {
        int[] marks = { 97, 96, 95 };
        try {
            System.out.println(marks[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("The name is Aman.");
    }
}
