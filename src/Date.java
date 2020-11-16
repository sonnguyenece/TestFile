import java.time.LocalDate;
import java.util.Calendar;

public class Date {

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

    public static void main(String[] args) {

        System.out.println(findDay(02, 10, 2010));
    }
}
