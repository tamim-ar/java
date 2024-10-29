package problems;

public class BirthYear {
    public static void main(String[] args) {
        int BirthYear = 20034, BirthMonth = 10, BirthDate = 19;
        int CurrentYear = 2024, CurrentMonth = 11, CurrentDate = 30;
        int TotalYear, TotalMonth, TotalDate;

        TotalYear = CurrentYear - BirthYear;
        TotalMonth = CurrentMonth - BirthMonth;
        TotalDate = CurrentDate - BirthDate;

        if (BirthYear > CurrentYear || BirthYear == CurrentYear && BirthMonth > CurrentMonth
                || BirthYear == CurrentYear && BirthMonth == CurrentMonth && BirthDate > CurrentDate
                || BirthMonth >= 12 || BirthDate >= 31 || CurrentMonth >= 12 || CurrentDate >= 31) {
            System.out.println("invalid date");
            System.exit(0);
        }

        if (TotalDate < 0) {
            TotalDate += 30;
            TotalMonth -= 1;
        }
        if (TotalMonth < 0) {
            TotalMonth += 12;
            TotalYear -= 1;
        }

        System.out.println(TotalYear + " " + TotalMonth + " " + TotalDate);

    }
}
