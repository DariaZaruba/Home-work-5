//"9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
//  Create HashSet<Integer> and add all unique numbers from the ArrayList."


import java.util.*;

public class Task6_9
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 50 + 0));
        }
        int n = numbers.size();
        System.out.println("Numbers Generated: " + numbers);
        System.out.println("Length of List: " + n);

        Set unicNambers = new HashSet(numbers);
//        arr = new int[0];
        System.out.println("HashSet of Unic Nambers: " + unicNambers);
        System.out.println("Length of HashSet: " + unicNambers.size());

    }
}



