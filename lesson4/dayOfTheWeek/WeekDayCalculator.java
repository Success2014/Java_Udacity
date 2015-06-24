public class WeekDayCalculator
{

    /**
     * Returns the day of the week it will be in daysToAdd days
     * days of the week are prepresented as integers, 
     * Sunday is 0, 
     * Monday is 1, 
     * Tuesday is 2...
     * 
     * @param today the number of today's day of the week
     * @param daysToAdd the number of days to add 
     */
    public int getDayOfTheWeek(int today, int daysToAdd) 
    {
        // Your code here!
        int runyears = 89/4 + 1;
        int totaldays = 365 * (1989 - 1900);
        int weekday = 0;
        totaldays = totaldays + (31 + 28 + 31 + 30 + 31 + 30 + 1) + runyears;
        weekday = totaldays % 7;

        System.out.print("Weekday: ");
        System.out.println(weekday);
    }

