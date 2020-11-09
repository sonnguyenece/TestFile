import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class TimestampValueOf {
    public static void main(String[] args) {

        String timestampString = "2020-12-12 10:10:10.66";
        System.out.println(Timestamp.valueOf(timestampString)) ;
        System.out.println(Time.valueOf(timestampString));
        System.out.println(Date.valueOf(timestampString));

    }
}
