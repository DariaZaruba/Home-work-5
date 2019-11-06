//3. Create Map vehicles : vehicles.put("BMW", 5);, print

import java.util.HashMap;
import java.util.Map;

public class Task6_3 {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<String, Integer>();

        vehicles.put("Skoda", 1);
        vehicles.put("Citroen", 2);
        vehicles.put("Honda", 3);
        vehicles.put("Mazda", 4);
        vehicles.put("BMW", 5);

//        System.out.println(vehicles.values(5));
        Integer first = vehicles.get("BMW");
        System.out.println(first);

    }
}
