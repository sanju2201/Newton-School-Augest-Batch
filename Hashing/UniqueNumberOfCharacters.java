package Hashing;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class UniqueNumberOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
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
        for (char ch : map.keySet()) {
            if (map.get(ch) > 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}

/*
 * Unique number of characters
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a string s, your task is to find the total number of unique characters
 * in a string.
 * Input
 * The first line of the input contains a string s, Note s can also contains
 * white spaces
 * 
 * Constraints
 * 1 <= s. length() <= 105
 * Output
 * Print the total number of unique characters.
 * Example
 * Sample Input 1:
 * newton School
 * 
 * Sample Output 1:
 * 10
 */