package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int arr[] = new int[n];
        long res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0, j = i + 2, k = n;
        while (j < k) {
            if (j < i + 2) {
                j = i + 2;
            }
            while (j < k && arr[j] - arr[i] <= p) {
                res += j - i - 1;
                j++;
            }
            i++;
            j = i + 2;
        }
        System.out.println(res);

    }

}

/*
 * D Triplets
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an array Arr[] of size N, your task is to count the number of triplets
 * Arr[i], Arr[j] and Arr[k] such that:-
 * i < j < k and the difference between every 2 elements of triplets is less
 * than or equal to P i. e |Arr[i] - Arr[j]| <= P, |Arr[i] - Arr[k]| <= P and
 * |Arr[j] - Arr[k]| <= P
 * Input
 * The first line of input contains two space- separated integers N and P The
 * next line of input contains N space separated integers depicting the values
 * of the Arr[].
 * 
 * Constraints:-
 * 3 <= N <= 100000
 * 1 <= Arr[i], P <= 1000000
 * Output
 * Return the count of triplets that satisfies the above conditions.
 * Example
 * Sample Input:-
 * 5 4
 * 1 3 2 5 9
 * 
 * Sample Output:-
 * 4
 * 
 * Explanation:-
 * (1, 3, 2), (1, 3, 5), (1, 2, 5), (2, 3, 5) are the required triplets
 * 
 * Sample Input:-
 * 5 3
 * 1 8 4 2 9
 * 
 * Sample Output:-
 * 1
 */