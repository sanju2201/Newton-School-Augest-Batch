package ControlStructureAndLoops;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 0:
                System.out.println("Zero");
                break;
            default:
                switch (a >> 31) {
                    case (0):
                        System.out.println("Positive");
                        break;
                    default:
                        System.out.println("Negative");
                }

        }
    }
}

/*
 * Checking a Number
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Write a program to check whether a number is positive, negative or zero using
 * switch case.
 * Input
 * The first line of the input contains the number
 * 
 * Constraints
 * -1e9 <= n <= 1e9
 * Output
 * Print the single line wether it's "Positive", "Negative" or "Zero"
 * Example
 * Sample Input :
 * 13
 * 
 * Sample Output :
 * Positive
 * 
 * Sample Input :
 * -13
 * 
 * Sample Output :
 * Negative
 */