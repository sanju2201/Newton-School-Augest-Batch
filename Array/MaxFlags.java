package Array;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxFlags {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[100000];
        int[] b = new int[100001];
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 1; i <= n; i++) {
                b[i] = 0;
            }
            for (int i = 0; i < m; i++) {
                if (a[i] <= n && a[i] >= 1) {
                    b[a[i]] = b[a[i]] + 1;
                } else if (a[i] == n + 1) {

                    for (int j = 1; j < n; j++) {
                        if (b[j] > b[j + 1]) {
                            int temp = b[j];
                            b[j] = b[j + 1];
                            b[j + 1] = temp;

                        }

                    }
                    for (int k = 1; k <= n; k++) {
                        b[k] = b[n];

                    }
                }

            }
            for (int i = 1; i <= n; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println("");

            t--;
        }
    }
}

/*
 * MaxFlags
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * You are given N flags, initially set to 0. Now you have to perform two
 * operations on them:
 * 
 * 1. Increase(F) by 1: flag F is increased by 1.
 * 2. max_flag: all flags are set to maximum value of any flag.
 * 
 * A non-empty array arr[] will be given of size M. This array represents
 * consecutive operations:
 * 
 * a) If arr[K] = F, such that 1 <= F <= N then operation K is Increase(F).
 * b) If arr[K] = N+1 then operation K is max_flag.
 * 
 * For example, given integer N = 5 and array arr of size 7 such that:
 * arr[0] = 3
 * arr[1] = 4
 * arr[2] = 4
 * arr[3] = 6
 * arr[4] = 1
 * arr[5] = 4
 * arr[6] = 4
 * 
 * the values of the flags after each consecutive operation will be:
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 * 
 * The goal is to calculate the value of every flags after all operations.
 * Input
 * The input line contains T, denoting the number of testcases.
 * Each testcase contains two lines.
 * First line contains an integer N, the number of flags and an integer M, size
 * of array 'arr'. S
 * econd line contains elements of array 'arr' separated by space.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N, M <= 10^5
 * 1 <= arr[i] <= N+1
 * 
 * Sum of N and M for each test case is less than or equal to 10^5
 * Output
 * For each testcase you need to print the updated array after all operations in
 * new line.
 * Example
 * Sample Input:
 * 1
 * 5 7
 * 3 4 4 6 1 4 4
 * 
 * Sample Output:
 * 3 2 2 4 2
 * 
 * Explanation:
 * Testcase 1:
 * the values of the flags after each consecutive operation will be:
 * (0, 0, 1, 0, 0)
 * (0, 0, 1, 1, 0)
 * (0, 0, 1, 2, 0)
 * (2, 2, 2, 2, 2)
 * (3, 2, 2, 2, 2)
 * (3, 2, 2, 3, 2)
 * (3, 2, 2, 4, 2)
 */
