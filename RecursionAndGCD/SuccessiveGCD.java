package RecursionAndGCD;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SuccessiveGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(solution(a, n));
    }

    public static int solution(int a[], int n) {
        if (n == 1) {
            return a[0];
        } else {
            int b[] = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                b[i] = gcd(a[i], a[i + 1]);
            }
            return solution(b, n - 1);
        }
    }

    public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;

    }
}

/*
 * Successive GCD
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an integer array A of size N initially. We take the GCD of all adjacent
 * elements. Now we obtain N-1 integers. Take this array as new array A. Keep
 * repeating this process until you obtain an array of only 1 element. Find that
 * last element that you get.
 * 
 * See explanation of example section for more clarity.
 * Input
 * First line contains an integers N.
 * Next line contains N space separated integers denoting elements of array.
 * 
 * Constraints
 * 1 <= N <= 10^5
 * 0 <= Ai<= 10^9
 * Output
 * Print the last element remaining.
 * Example
 * Sample Input 1:
 * 3
 * 1 2 3
 * 
 * Output
 * 1
 * 
 * Explanation:
 * Array ={1, 2, 3}
 * Taking GCD of adjacent elements, Array ={1, 1}
 * Taking GCD of adjacent elements, Array ={1}
 * Now we stop as only one element is left.
 * 
 * Sample Input 2:
 * 6
 * 3 6 6 9 3 3
 * 
 * Output
 * 3
 * 
 * Explanation
 * Array ={3, 6, 6, 9, 3, 3}
 * Taking GCD of adjacent elements, Array ={3, 6, 3, 3, 3}
 * Taking GCD of adjacent elements, Array ={3, 3, 3, 3}
 * Taking GCD of adjacent elements, Array ={3, 3, 3}
 * Taking GCD of adjacent elements, Array ={3, 3}
 * Taking GCD of adjacent elements, Array ={3}
 * Now we stop as only one element is left.
 */