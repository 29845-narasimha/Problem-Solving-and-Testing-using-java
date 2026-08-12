import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        // Parse the input date strings into LocalDate objects
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        
        // Calculate the absolute difference in days between the two dates
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
