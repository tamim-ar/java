package problems;

public class LeapYear {
    public static void main(String[] args) {
        int i = 2025;

        if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
            System.out.println("This is leap year.");
        } else {
            System.out.println("This is not leap year.");
        }
    }
}
