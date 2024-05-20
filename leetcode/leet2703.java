public class leet2703 {
    public static void main(String[] args) {
        // Call the method with three arguments; the result is 3 because three arguments were passed
        int result = argumentsLength(1, 2, 3);
        // Output the result to the console
        System.out.println("Number of arguments passed: " + result);
    }

    public static int argumentsLength(Object... args) {
        return args.length;
    }
}