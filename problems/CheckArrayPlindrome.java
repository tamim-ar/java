package problems;

public class CheckArrayPlindrome {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                System.out.println("Not.");
                System.exit(0);
            } else {
                left++;
                right--;
            }
        }
        System.out.println("Yes.");
    }
}
