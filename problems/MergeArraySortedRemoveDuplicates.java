package problems;

import java.util.*;

public class MergeArraySortedRemoveDuplicates {
    public static void main(String[] args) {
        int[] a = { 7, -5, 3, 8, -4, 11, -19, 21 };
        int[] b = { 6, 13, -7, 0, 11, -4, 3, -5 };
        int[] c = new int[a.length + b.length];
        int[] d = new int[c.length];
        int i, j;

        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (i = 0; i < a.length; i++) {
            c[i + a.length] = b[i];
        }

        for (i = 0; i < c.length; i++) {
            for (j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }

        for (i = 0; i < c.length; i++) {
            if (i == 0 || c[i] != c[i - 1]) {
                d[i] = c[i];
            }
        }

        System.out.println(Arrays.toString(d));
    }
}