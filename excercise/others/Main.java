import java.util.Calendar;

public class Main {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        String[] daysOfWeek = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        return daysOfWeek[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        int day = 15;
        int month = 11;
        int year = 2024;

        System.out.println(findDay(month, day, year));
    }
}
