//Create an array of 15 random integers from the segment [0;   9].
// Display the array on the screen. Count how many in the array
// of even elements and display this number on the screen on a separate line.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;

public class Task6_4 {

    static void countingEven(List<Integer> numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of even elements =" + evenCount);
        System.out.println("Number of odd elements =" + oddCount);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++) {
            numbers.add((int) (Math.random() * 9 + 0));
        }
        int n = numbers.size();
        System.out.println("Numbers Generated: " + numbers);
        System.out.println("Length of List: " + n);
        countingEven(numbers);
    }
}



//    public static void main(String[] args)
//    {
//        int[] arr = new int[15];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 9 + 0);
//        }//end for loop
//        int n = arr.length;
//        CountingEven(arr, n);
//        System.out.println("Numbers Generated: " + Arrays.toString(arr));
//        System.out.println("Length of Array: " + arr.length);
//    }