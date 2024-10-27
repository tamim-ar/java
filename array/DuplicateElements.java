public class DuplicateElements {
    public static void main(String[] args) {
        int i, j;
        int[] a = { 1, 2, 2, 4, 6, 7, 6 };

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
