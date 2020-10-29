import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidate {

    public static void main(String[] args) {
        System.out.println(isValidDate("2020-12-30"));
        System.out.println(isValidDate("2020-12-31"));
        System.out.println(isValidDate("2020-02-30"));
    }

        static boolean isValidDate(String input) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            try {
                LocalDate date = formatter.parse(input, LocalDate::from);
                return true;
            } catch (DateTimeParseException e) {
               return false;
            }
        }

    }
