public class halfpyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}