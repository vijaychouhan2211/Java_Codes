package Collection.Map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put("Din", 19);
        ht.put("John", 20);
        ht.put("David", 22);
        ht.put("Rick", 23);
        ht.put("Ronald", 24);
        System.out.println(ht);

        System.out.println(ht.keySet());

//        //Iterator for values
//        Iterator<String> it = ht.keySet().iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            System.out.println(ht.get(key));
//        }
//
        Iterator<Map.Entry<String, Integer>> iterator = ht.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}