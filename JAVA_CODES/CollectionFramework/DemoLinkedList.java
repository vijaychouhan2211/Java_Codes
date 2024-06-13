package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {
        System.out.println("-------------------------LinkedList-------------------------");
        LinkedList<String> name = new LinkedList<String>();
        name.add("Om");
        name.add("Sam");
        name.addFirst("Dev");
        name.add(1,"Raju");
        name.addLast("Vikram");
        name.remove(3);

        Iterator<String> it = name.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
