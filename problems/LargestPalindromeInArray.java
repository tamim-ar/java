package problems;

public class LargestPalindromeInArray {
    public static void main(String[] args) {
        int[] a = { 121, 232, 343, 454, 565, 676, 787, 898 };
        int largestPalindrome = -1;

        for (int num : a) {
            int original = num, reserved = 0;

            while (num != 0) {
                int remainder = num % 10;
                reserved = reserved * 10 + remainder;
                num = num / 10;
            }
            if (original == reserved && original > largestPalindrome) {
                largestPalindrome = original;
            }
        }
        System.out.println(largestPalindrome);
    }
}
