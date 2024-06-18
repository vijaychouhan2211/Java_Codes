package Collection.Map;

import java.util.HashMap;

//1. It used to hold key value pairs
//2. Underlying data Structure is HashTable.
//3. Duplicate keys are not allowed but values can be duplicated.
//4. Insertion order is not preserved.
//5. Null is allowed for key (only once)and allows for values any number of times.
//6. Every method is non-synchronized so multiple Threads are operate at a time hence permanence is high

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 7);
        map.put("F", 6);

        System.out.println(map);
        System.out.println(map.get("A"));
        System.out.println(map.containsKey("B"));
        System.out.println(map.containsValue(7));
        System.out.println(map.containsValue(6));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.size());

    }
}
