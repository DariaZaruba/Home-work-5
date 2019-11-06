//"6. Create ArrayList of Strings. Add 10 different Strings to it.
//   Using any cycle find the longest String in the list and print it out.
//   If there are several String with the same legth - print each from a new line."
//"1) Create ArrayList of String and initialize it.
//        2) All values with the highest length should be printed out."

import java.util.ArrayList;
import java.util.Scanner;

public class Task6_6
{
    public static void main(String args[])
    {
        ArrayList<String> People = new ArrayList<String>();
        People.add("Anastasia");
        People.add("Charlotte");
        People.add("Elizabeth");
        People.add("Genevieve");
        People.add("Josephine");
        People.add("Constantine");
        People.add("Jonathan");
        People.add("Lawrence");
        People.add("Nathaniel");
        People.add("Sebastian");
        int largestString = People.get(0).length();
        int index = 0;

        for(int i = 0; i < People.size(); i++)
        {
            if(People.get(i).length() > largestString)
            {
                largestString = People.get(i).length();
                index = i;
            }
        }
        System.out.println("The longest String in array is: " + People.get(index));
        System.out.println("The size of String is: " + largestString);
    }
}