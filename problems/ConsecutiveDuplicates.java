package problems;

import java.util.*;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        StringBuilder name1 = new StringBuilder();
        name1.append(name.charAt(0));

        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i) != name.charAt(i - 1)) {
                name1.append(name.charAt(i));
            }
        }
        System.out.println(name);
        System.out.println(name1);
        scan.close();
    }
}