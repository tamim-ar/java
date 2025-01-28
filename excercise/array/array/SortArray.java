package array;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int i, j;
        int[] a = { 1, 9, 2, 8, 3, 7, 4, 6, 5 };

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
