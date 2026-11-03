import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
    public static void main(String[] args) {

        // Calendar
        Calendar c = Calendar.getInstance();

        System.out.println("Calendar:");
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + c.get(Calendar.DATE));

        // GregorianCalendar
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("\nGregorian Calendar:");
        System.out.println("Year: " + gc.get(Calendar.YEAR));
        System.out.println("Month: " + (gc.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + gc.get(Calendar.DATE));

        System.out.println("Leap Year: " +
                gc.isLeapYear(gc.get(Calendar.YEAR)));
    }
}
