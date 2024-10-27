import java.util.*;

public class nnumberclass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            int i = 0, n = sc.nextInt();

            for (i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
