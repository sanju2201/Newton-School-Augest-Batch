package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class OddCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i = i + 2) {
            System.out.print(s.charAt(i) + " ");

        }
    }
}

/*
 * Odd characters
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a string(1-indexed). Print all the characters of the string at odd
 * positions.
 * Input
 * The first line of the input contains a string S. String contains only
 * lowercase english letters.
 * 
 * Constraints:-
 * 1 <= |S| <= 100
 * Output
 * The output should contain the character's at odd positions seperated by
 * space.
 * Example
 * Sample Input
 * abcde
 * 
 * Sample Output
 * a c e
 * 
 * Sample Input
 * abcd
 * 
 * Sample Output
 * a c
 * 
 */