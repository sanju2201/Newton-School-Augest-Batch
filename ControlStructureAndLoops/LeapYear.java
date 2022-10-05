package ControlStructureAndLoops;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int count = 0;
        if (year % 4 == 0) {
            count = 1;
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    count = 1;
                } else {
                    count = 0;
                }
            }

        } else {
            count = 0;
        }
        if (count == 1) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}

/*
 * 
 * Sample Output:
 * YES
 * 
 * Sample Input:
 * 2003
 * 
 * Sample Output:
 * NO
 * 
 * Sample Input:
 * 1900
 * 
 * Sample Output:
 * NO
 */