package problems;

import java.util.Arrays;

public class RemoveNegatives {
    public static int removeNega(int[] arr, int length) {
        int newSize = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] >= 0) {
                arr[newSize] = arr[i];
                newSize++;
            }
        }
        return newSize;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 4, 5, -6, -7, 8, 3 };
        System.out.println(Arrays.toString(arr));
        int newSize = removeNega(arr, arr.length);

        for(int i= 0; i<newSize; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println(newSize);
    }
}
