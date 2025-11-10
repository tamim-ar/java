package array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int j = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
