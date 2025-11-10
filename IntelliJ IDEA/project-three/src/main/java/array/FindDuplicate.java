package array;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 4};
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = true;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
