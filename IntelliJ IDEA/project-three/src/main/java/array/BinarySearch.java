package array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int search = 6;

        System.out.println(bSearch(numbers, search));
    }

    static int bSearch(int[] numbers, int search) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == search) {
                return numbers[mid];
            } else if (numbers[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
