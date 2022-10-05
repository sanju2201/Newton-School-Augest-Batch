package ControlStructureAndLoops;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class StepsExecution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, num;

        // System.out.println("Enter 4 digit number = ");
        for (i = 0; i < 1; i++) {
            num = sc.nextInt();
            if (num > 999 && num <= 9999) {
                // System.out.println(num);
                int num1 = num + 8;
                // System.out.println("Add 8 =" + num1);
                int num2 = num1 / 3;
                // System.out.println("Divided by 3" + num2);
                int num3 = num2 % 5;
                // System.out.println("Moduloby 5 = " + num3);
                int num4 = num3 * 5;
                // System.out.println("Multiply by 5 = " + num4);
                System.out.println(num4);
            }
        }
    }
}

/*
 * Steps Execution
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Take 4 digit number input from the user, add 8 to it and then divide it by
 * 3(Only take integer part) Now, the modulus of that number is taken with 5 and
 * then multiply the resultant value by 5. Display the final result.
 * Input
 * First line contains 4 digit number
 * 
 * Constraints
 * 1000 <= number <= 9999
 * Output
 * Print the final result
 * Example
 * Sample Input :
 * 2345
 * 
 * Sample Output :
 * 20
 */
