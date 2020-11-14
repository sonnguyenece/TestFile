public enum DAY_OF_WEEK {
    MONDAY(4, "MONDAY"),
    TUESDAY(5, "TUESDAY"),
    WEDNESDAY(6, "WEDNESDAY"),
    THURSDAY(7, "THURSDAY"),
    FRIDAY(1, "FRIDAY"),
    SATURDAY(2, "SATURDAY"),
    SUNDAY(3, "SUNDAY");

    private int dayNum;
    private String weekDay;

    DAY_OF_WEEK(int dayNum, String weekDay) {
        this.dayNum = dayNum;
        this.weekDay = weekDay;
    }

    public int getDayNum() {
        return this.dayNum;
    }

    public String getWeekDay() {
        return this.weekDay;
    }
}

