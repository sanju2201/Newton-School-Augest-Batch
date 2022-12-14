package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RevStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }
        System.out.print(str1);

    }
}

/*
 * Rev Strings
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given a string your task is to reverse the given string.
 * Input
 * The first line of the input contains a string.
 * 
 * Constraints:-
 * 1 <= string length <= 100
 * String contains only lowercase english letters
 * Output
 * The output should contain reverse of the input string.
 * Example
 * Sample Input
 * abc
 * 
 * Sample Output
 * cba
 */