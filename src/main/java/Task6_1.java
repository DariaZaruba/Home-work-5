//1. Create ArrayList and print it.

import java.util.ArrayList;

public class Task6_1 {
    public static void main(String[] args) {
        ArrayList arrlist = new ArrayList();
        arrlist.add("Sunday");
        arrlist.add("Monday");
        arrlist.add("Tuesday");
        arrlist.add("Wednesday");
        arrlist.add("Thursday");
        arrlist.add("Friday");
        arrlist.add("Saturday");

        System.out.println("Using For Loop\n ");
        for (
                int i = 0; i < arrlist.size(); i++) {
            System.out.println(arrlist.get(i));
        }
    }
}
