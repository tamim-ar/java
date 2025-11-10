//package array;
//
//public class FindDuplicate {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 5, 4};
//        boolean flag = false;
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] == numbers[j]) {
//                    flag = true;
//                    break;
//                }
//            }
//        }
//
//        if (flag) {
//            System.out.println("Found");
//        } else {
//            System.out.println("Not Found");
//        }
//    }
//}

package array;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 4, 7, 3, 8, 9, 2, 5, 6, 10, 7, 4, 2, 1, 9, 8, 5};

        for (int i = 0; i < numbers.length; i++) {
            int count = 1;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            System.out.println(numbers[i] + " Found " + count + " Times.");
        }
    }
}


