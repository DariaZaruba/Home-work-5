//2. Create ENUM and print.

import java.util.logging.Level;

public class Task6_2 {

    public enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    public static void main(String[] args) {
        for (Days myDay : Days.values()) {
            System.out.println(myDay);
        }
    }
}
