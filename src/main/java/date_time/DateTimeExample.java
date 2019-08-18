package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeExample {

    public static void main(String[] args) {

        String pattern = "yyyy-MM-dd HH:mm:ss Z z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        // "Asia/Kolkata"
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        System.out.println(simpleDateFormat.format(new Date()));

    }
}
