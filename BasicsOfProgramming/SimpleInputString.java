package BasicsOfProgramming;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SimpleInputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        System.out.print(S);
    }
}

/*
 * Simple Input- String
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a string S, your task is to take input of the given string and print
 * the same string.
 * Input
 * The input contains a single string S.
 * Output
 * Print the string S.
 * Example
 * Sample Input:-
 * NewtonSchool
 * 
 * Sample Output:-
 * NewtonSchool
 * 
 * Sample Input:-
 * Hello
 * 
 * Sample Output:-
 * Hello
 */