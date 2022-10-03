package Hashing;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhp = new LinkedHashMap<>();
        lhp.put("India", 10000);
        lhp.put("SriLanka", 12000);
        lhp.put("Oman", 52222);
        lhp.put(null, null);
        lhp.put("Bhilai", null);

        System.out.println(lhp);
        System.out.println(lhp.containsKey("India"));
        System.out.println(lhp.get("Oman"));
        lhp.remove("SriLanka");
        System.out.println();
    }

}
