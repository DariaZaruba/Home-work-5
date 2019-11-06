//"7. Create HashMap<String, String> and add 10 pairs:

//        Print the content of the map, each pair from a new line.

import java.util.HashMap;
import java.util.Map;

public class Task6_7 {
    public static void main(String[] args) {
        Map<String, String> HushMap = new HashMap<String, String>();

        HushMap.put("watermelon", "berry");
        HushMap.put("banana", "fruit");
        HushMap.put("cherry", "berry");
        HushMap.put("pineapple", "fruit");
        HushMap.put("melon", "vegetable");
        HushMap.put("cranberry", "berry");
        HushMap.put("apple", "fruit");
        HushMap.put("iris", "flower");
        HushMap.put("potato", "vegetable");
        HushMap.put("carrot", "vegetable");

        for (Map.Entry entry : HushMap.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}

