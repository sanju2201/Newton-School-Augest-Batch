package Hashing;

import java.util.Scanner;
import java.util.*;

public class PrintSingleOccuringDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : a) {
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else {
                map.put(x, map.get(x) + 1);
            }
        }

        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                System.out.println(x + " ");
            }
        }

        List<Integer> list = new ArrayList<Integer>(map.keySet());
        Collections.sort(list, (b, c) -> {
            return ((map.get(b) == map.get(c))) ? b - c : (map.get(b) - map.get(c));
        });
    }
}