package ControlStructureAndLoops;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MagicTrick {
    public static void main(String[] args) {
        int X = 6;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int two = X + A;
        int three = two * 2;
        int four = three + B;
        int five = four / 2;
        int six = five - X;
        System.out.println(six);
    }
}

/*
 * Magic Trick
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
 * 1. Think of a number X(don't tell Sara)
 * 2. Add A(Given by Sara) to it.
 * 3. Double the sum in your mind.
 * 4. Add an even number B(Given by Sara) to it.
 * 5. Half the amount
 * 6. Subtract the initial number which you had taken from the sum
 * After this Sara will tell the resulting amount without knowing the initial
 * number, can you print the result for her?
 * Input
 * Input Contains two integers A and B separated by spaces.
 * 
 * Constraints:-
 * 1 <= A, B <= 1000
 * Output
 * Print the resulting amount
 * Example
 * Sample Input:-
 * 3 4
 * 
 * Sample Output:-
 * 5
 * 
 * Sample Input:-
 * 8 4
 * 
 * Sample Output:-
 * 10
 */