//"8. Create HashMap<String, String> and add 10 pairs:
//Print only vegetables to the console
//        1) Do not use predefined keys to get vegetables. You should use conditions to find vegetables.
//        "1) Map iterator;
//        2) Map.Entry
//        3) Foreach"


import java.util.*;
import java.util.stream.Collectors;

public class Task6_8 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("watermelon", "berry");
        hashMap.put("banana", "fruit");
        hashMap.put("cherry", "berry");
        hashMap.put("pineapple", "fruit");
        hashMap.put("melon", "vegetable");
        hashMap.put("cranberry", "berry");
        hashMap.put("apple", "fruit");
        hashMap.put("iris", "flower");
        hashMap.put("potato", "vegetable");
        hashMap.put("carrot", "vegetable");

        System.out.println("Stream");
        hashMap.values().stream().filter(f -> f.equals("vegetable")).forEach(System.out::println);

        Set<String> conditions = Set.of("vegetable");
        System.out.println("Next loop");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            if (conditions.contains(entry.getValue())) {
                System.out.println(entry.getValue());
            }
        }

    }
}
