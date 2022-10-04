package Hashing;

import java.util.Scanner;

import java.util.HashMap;

public class FindDuplicateInArray {
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

        // For printinf the Result
        for (int x : map.keySet()) {
            if (map.get(x) > 1) {
                System.out.println(x + " ");

            }
        }

    }

}
