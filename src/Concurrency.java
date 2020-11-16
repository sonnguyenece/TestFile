import java.text.NumberFormat;
import java.util.*;

public class Concurrency {

    public static void main(String[] args) {
        /* Read input */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /* Create custom Locale for India.
          I used the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");
        Locale vietnamLocale = new Locale("vi", "VN");

        /* Create NumberFormats using Locales */
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat vietnam = NumberFormat.getCurrencyInstance(vietnamLocale);

        /* Print output */
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
        System.out.println("Vietnam: " + vietnam.format(payment));
    }
}