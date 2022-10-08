package MockInterview.DSABasicMock1;

import java.util.*;

public class Que03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 2, 9, 7, 9, 7, 9 };
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
            System.out.print(x + " ");
        // }
         

        }

    }