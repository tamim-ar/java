import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int no = 1;
        while (scan.hasNext()) {
            System.out.println(no++ + " " + scan.nextLine());
        }
        scan.close();
    }
}