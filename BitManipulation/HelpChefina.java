package BitManipulation;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class HelpChefina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int k = sc.nextInt();

            int mask = 1 << k - 1;
            if ((n & mask) == 0) {
                System.out.println("NOT SET");
            } else {
                System.out.println("SET");
            }
        }
    }
}
/*
 * Help Chefina
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Chef and Chefina are playing a game, Chef asks Chefina that whether the ith
 * bit is set in the binary representation of the number. Chefina knows how to
 * do it but she is taking quite a lot time. You are Chefina friend so help her
 * out from this situation.
 * Input
 * The first line of the input contains test case value T.
 * Next T lines contains two values N and K, i. e the number N and the Kth bit.
 * 
 * Constraints
 * 1 <= T <= 1e5
 * 1 <= N <= 1e18
 * 1 <= K <= 61
 * Output
 * Print "SET" if the Kth bit is set and "NOT SET" if it's not.
 * Example
 * Sample Input
 * 2
 * 2 1
 * 1 1
 * 
 * Sample Output
 * NOT SET
 * SET
 * 
 * Explanation
 * 2's binary representation : 10 hence the first bit is 0 which is not set
 * 1's binary representation : 1 hence the first bit is 1 which is set
 */