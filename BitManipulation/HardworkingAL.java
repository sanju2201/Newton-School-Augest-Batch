package BitManipulation;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class HardworkingAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long j = 1;
        int count = 0;
        for (int i = 0; i < 64; i++) {
            if ((n & (j << i)) != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
 * Hardworking AL
 * easy
 * hint
 * Hint
 * 
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Al is given task to build a skyscraper of N floors. He can build 2**i (2 to
 * the power i, where i can be any non-negative integer) floors in one day.
 * Report the minimum number of days required to build the skyscraper.
 * Input
 * First and only line of input contains a single integer N.
 * 
 * Constraints :
 * 1 <= N <= 1000000000000
 * Output
 * Print a single integer, the minimum number of days required to build the
 * skyscraper.
 * Example
 * Sample Input:
 * 5
 * 
 * Sample Output:
 * 2
 * 
 * Sample Input:
 * 1
 * 
 * Sample Output:
 * 1
 */
