package problems;

import java.util.*;

public class Input10UniqeNumber {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter unique number " + (i + 1) + ": ");
            a[i] = scan.nextInt();
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    System.out.print("Enter again:");
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
