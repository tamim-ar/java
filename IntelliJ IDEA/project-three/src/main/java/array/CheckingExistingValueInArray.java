package array;

public class CheckingExistingValueInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4};
        int temp = 1;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == temp) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
