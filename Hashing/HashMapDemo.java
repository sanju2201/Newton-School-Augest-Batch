package Hashing;

import java.util.*;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> ht = new HashMap<Integer, String>();
        ht.put(1, "L");
        ht.put(2, "u");
        ht.put(3, "c");
        ht.put(4, "k");

        System.out.println(ht);

        System.out.println(ht.get(2));

        ht.remove(4);
        System.out.println(ht);

        Iterator<Integer> itr = ht.keySet().iterator();
        while (itr.hasNext()) {
            Integer key = itr.next();
            String mapValue = ht.get(key);
            System.out.println("KEY: " + key + " , VALUE: " + mapValue);

        }

    }

}
