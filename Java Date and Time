import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        
        // Months in Calendar are 0-indexed (0 for January, 11 for December)
        calendar.set(year, month - 1, day);
        
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        // DAY_OF_WEEK returns 1 for Sunday, 2 for Monday, etc.
        return days[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

}
