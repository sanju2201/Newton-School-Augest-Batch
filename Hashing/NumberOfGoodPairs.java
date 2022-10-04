package Hashing;

import java.util.Scanner;
import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 1, 2, 3, 1, 1, 3 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int count = 0;
        for (int x : map.keySet()) {
            if (map.get(x) >= 2) {
                count = count + (map.get(x) * (map.get(x) - 1)) / 2;
            }
        }
        System.out.println(count);

    }
}
