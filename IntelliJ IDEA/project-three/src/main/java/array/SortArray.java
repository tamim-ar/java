package array;

import java.util.Arrays;

public class SortArray {
    static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 2, 3, 1, 0, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
