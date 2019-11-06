//"5. Create ArrayList of Strings. Add 5 different Strings to it.
//  Using any cycle print all the values of the ArrayList to the console."
//  "1) Create ArrayList of String and initialize it.
//   2) The size of the ArrayList should be printed to the console.
//   3) All values should be printed to the console (each from a new line)"

import java.util.ArrayList;
import java.util.List;

public class Task6_5 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Nokia");
        list.add("Sumsung");
        list.add("Google");
        list.add ("Xiaomi");
        System.out.println("The size of Array List is " + list.size());

        System.out.println("Array's elements:");
        for (
                int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

