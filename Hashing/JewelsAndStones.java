package Hashing;

import java.util.Scanner;
import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String j = sc.next();
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        int count = 0;
        for (int i = 0; i < j.length(); i++) {
            char key = j.charAt(i);
            if (map.containsKey(key)) {
                count = count + map.get(key);
            }
        }
        System.out.println(count);

    }

}

/*
 * 771. Jewels and Stones
 * Easy
 * 
 * 3970
 * 
 * 511
 * 
 * Add to List
 * 
 * Share
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a
 * type of stone you have. You want to know how many of the stones you have are
 * also jewels.
 * 
 * Letters are case sensitive, so "a" is considered a different type of stone
 * from "A".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 * Example 2:
 * 
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 * 
 * 
 * Constraints:
 * 
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 * 
 */
