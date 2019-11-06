////"10. Create enum for days of the week.
////        Write a program which will be printing the number of a day according to day of the week.
////        Example:
////        If today is Sunday - print 1;
////        If today is Monday - print 2
////        ..."

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task6_10 {


    public enum Days {
        SUNDAY(1),
        MONDAY(2),
        TUESDAY(3),
        WEDNESDAY(4),
        THURSDAY(5),
        FRIDAY(6),
        SATURDAY(7);

        private int day;

        Days(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }
    }

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DayOfWeek currentDay = date.getDayOfWeek();
        for (Days myDay : Days.values()) {
            if (myDay.ordinal() == currentDay.getValue())
                System.out.println(myDay + " " + myDay.getDay());
        }
    }
}
