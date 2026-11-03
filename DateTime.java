import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTime {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat dateFormat =
            new SimpleDateFormat("dd-MM-yyyy");

        SimpleDateFormat timeFormat =
            new SimpleDateFormat("HH:mm:ss");

        System.out.println("Current Date: " +
            dateFormat.format(date));

        System.out.println("Current Time: " +
            timeFormat.format(date));
    }
}
