package HW.HW9.months;

public class MonthUtils {
    public static Month JANUARY = new Month("January", 31, 21);
    public static Month FEBRUARY = new Month("February", 29, 20);
    public static Month MARCH = new Month("March", 31, 21);
    public static Month APRIL = new Month("April", 30, 22);
    public static Month MAY = new Month("May", 31, 22);
    public static Month JUNE = new Month("June", 30, 19);
    public static Month JULY = new Month("July", 31, 22);
    public static Month AUGUST = new Month("August", 31, 22);
    public static Month SEPTEMBER = new Month("September", 30, 20);
    public static Month OCTOBER = new Month("October", 31, 22);
    public static Month NOVEMBER = new Month("November", 30, 19);
    public static Month DECEMBER = new Month("December", 31, 21);

    public static Month[] ALL_MONTHS ={
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST,
            SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };
    public static Month[] SUMMER = {
            JUNE, JULY, AUGUST
    };

}
