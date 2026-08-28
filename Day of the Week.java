class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {
            "Friday", "Saturday", "Sunday",
            "Monday", "Tuesday", "Wednesday", "Thursday"
        };

        int[] monthDays = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int totalDays = 0;

        // Add days for the years before the given year
        for (int y = 1971; y < year; y++) {
            totalDays += isLeap(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            totalDays += monthDays[m - 1];
            if (m == 2 && isLeap(year)) {
                totalDays++;
            }
      }
        totalDays += day - 1;

        return days[totalDays % 7];
    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
