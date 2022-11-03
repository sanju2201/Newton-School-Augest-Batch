package MockInterview.DSABasicMock1;

import java.util.*;

public class Mock31 {
    public static void main(String[] args) {
        int a[] = { 2, 1, 2, 3, 3, 4, 4 };
        int n = a.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.put(a[i], map.get(a[i]) + 1);
            }
        }

        for (int x : map.keySet()) {
            System.out.println(map.get(x));
        }

    }

}
