import java.util.Scanner;

public class input {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();

        System.out.println(a);
    }
}
}