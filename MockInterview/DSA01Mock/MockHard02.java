package MockInterview.DSA01Mock;

import java.util.*;

public class MockHard02 {
    public static void main(String[] args) {
        int a[] = { 3, 2, 1, 2, 3, 3, 4, 4, 4 };
        int n = a.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        for (int key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }

}
