import java.util.Calendar;

public class Date {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 4:
                return DAY_OF_WEEK.MONDAY.getWeekDay();
            case 5:
                return DAY_OF_WEEK.TUESDAY.getWeekDay();
            case 6:
                return DAY_OF_WEEK.WEDNESDAY.getWeekDay();
            case 7:
                return DAY_OF_WEEK.THURSDAY.getWeekDay();
            case 1:
                return DAY_OF_WEEK.FRIDAY.getWeekDay();
            case 2:
                return DAY_OF_WEEK.SATURDAY.getWeekDay();
        }
        return DAY_OF_WEEK.SUNDAY.getWeekDay();
    }

    public static void main(String[] args) {

        System.out.println(findDay(11, 20, 2020));
    }
}
