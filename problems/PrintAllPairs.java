package problems;

public class PrintAllPairs {
    public static void main(String[] args) {
        int[] a = { 1, 5, 7, -1, 5 };
        int sum = 6;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.print("(" + a[i] + "," + a[j] + ")");
                }
            }
        }
    }
}
