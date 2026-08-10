import java.util.*;

public class DateDifference{
    public static void main(String[] args){
        int day1, month1, year1;
        int day2, month2, year2;

        ArrayList<Integer> daysInMonths = new ArrayList<>(Arrays.asList(
            0,  // Index 0: Placeholder
            31, // Index 1: January
            28, // Index 2: February
            31, // Index 3: March
            30, // Index 4: April
            31, // Index 5: May
            30, // Index 6: June
            31, // Index 7: July
            31, // Index 8: August
            30, // Index 9: September
            31, // Index 10: October
            30, // Index 11: November
            31  // Index 12: December
        ));

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first date (day month year): ");
            day1 = scanner.nextInt();
            month1 = scanner.nextInt();
            year1 = scanner.nextInt();
            
            System.out.print("Enter the second date (day month year): ");
            day2 = scanner.nextInt();
            month2 = scanner.nextInt();
            year2 = scanner.nextInt();
            
            // Calculate the total number of days for both dates
            int totalDays1 = calculateTotalDays(day1, month1, year1, daysInMonths);
            int totalDays2 = calculateTotalDays(day2, month2, year2, daysInMonths);
            
            // Calculate the difference in days
            int difference = Math.abs(totalDays2 - totalDays1);
            System.out.println("The difference between the two dates is: " + difference + " days");
        }
    }

    public static int calculateTotalDays(int day, int month, int year, ArrayList<Integer> daysInMonths) {
        int totalDays = 0;

        // Add days for the years
        for (int y = 1; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        // Add days for the months of the current year
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonths.get(m);
            if (m == 2 && isLeapYear(year)) {
                totalDays++; // Add an extra day for leap years in February
            }
        }

        // Add the days of the current month
        totalDays += day;

        return totalDays;
    }

    public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
}
