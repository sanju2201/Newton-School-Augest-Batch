package Searching;

public class FloorAndCeil {

    static void floorAndCeil(int a[], int n, int x) {
        int it = lower(a, n, x);
        if (it == 0) {
            if (a[it] == x) {
                System.out.println(x + " " + x);
            } else {
                System.out.println("-1 " + a[it]);
            }
        } else if (it == n) {
            it--;

            System.out.println(a[it] + " -1");
        } else {
            if (a[it] == x) {
                System.out.println(x + " " + x);
            } else {
                it--;
                System.out.println(a[it] + " " + a[it + 1]);
            }
        }
    }

    static int lower(int a[], int n, int k) {
        int l = 0;
        int h = n - 1;
        int m;
        int ans = n;
        while (l <= h) {
            m = l + h;
            m /= 2;
            if (a[m] < k) {
                l = m + 1;
            } else {
                h = m - 1;
                ans = m;
            }
        }
        return ans;
    }
}

/*
 * Floor and Ceil
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given a sorted array of N integers a[], and Q queries. For each query, you
 * will be given one element K your task is to print the maximum element from
 * the array which is less than or equal to the given element(Floor), and the
 * minimum element from the array which is greater than or equal to the given
 * element(Ceil).
 * Input
 * In case of Java only
 * User Task:
 * Since this will be a functional problem, you don't have to take input. You
 * just have to complete the function floorAndCeil() that takes the array a[],
 * integer N and integer k as arguments.
 * 
 * Custom Input
 * The first line of input contains a single integer N. The Second line of input
 * contains N space-separated integers depicting the values of the array. The
 * third line of input contains a single integer Q. The next Q line of input
 * contains a single integer the value of K.
 * 
 * Constraints:-
 * 1 <= N <= 100000
 * 1 <= K, Arr[i] <= 1000000000000
 * 1 <= Q <= 10000
 * Output
 * In a new line Print two space-separated integers depicting the values of
 * Floor and Ceil of the given number. If the floor or ceil of the element does
 * not exist print -1.
 * Example
 * Sample Input:-
 * 5
 * 2 5 6 11 15
 * 5
 * 2
 * 4
 * 8
 * 1
 * 16
 * 
 * Sample Output:-
 * 2 2
 * 2 5
 * 6 11
 * -1 2
 * 15 -1
 */