import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] mark = new int[3];
        mark [0] = 2;
        mark [1] = 5;
        mark [2] = 0;

        System.out.println(mark[0]);
        System.out.println(mark.length);
        Arrays.sort(mark);
        System.out.println(mark[0]);

        boolean[] present = new boolean[2];
        present[0] = true;
        present[1] = false;

        System.out.println(present[0]);

        int[] newarr = {43, 56, 34, 34};
        System.out.println(newarr[3]);

        int[][] final_mark = {{1,2,3}, {4,5,6}};
        System.out.println(final_mark[1][2]);
    }
}
