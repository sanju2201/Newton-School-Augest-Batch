package StringAndTwoPointers;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PrintSquaredSortedArray {
    public static void sortedSquares(int[] nums) {

        int arr[] = new int[nums.length];
        int i = 0, j = nums.length - 1;
        int p = j;

        while (i <= j) {
            if (Math.abs(nums[i]) <= Math.abs(nums[j])) {
                arr[p--] = nums[j] * nums[j];
                j--;
            } else {
                arr[p--] = nums[i] * nums[i];
                i++;
            }
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String srr[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; ++i)
                arr[i] = Integer.parseInt(srr[i]);

            sortedSquares(arr);

        }
    }
}

/*
 * Print Squared Sorted Array
 * easy
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Given an sorted array Arr[] of size N, containing both negative and positive
 * integers, you need to print the squared sorted output.
 * 
 * Note Try using two pointer approach
 * Input
 * The first line of input contains T, denoting the number of test cases. Each
 * testcase contains 2 lines. The first line contains N size of array. Second
 * line contains elements of array separated by space.
 * 
 * Constraints:
 * 1 <= T <= 100
 * 1 <= N <= 10000
 * -10000 <= A[i] <= 10000
 * 
 * Sum of N over all testcases does not exceed 10^6
 * Output
 * For each test case you need to print the sorted squared output in new line
 * Example
 * Input:
 * 1
 * 5
 * -7 -2 3 4 6
 * 
 * Output:
 * 4 9 16 36 49
 */