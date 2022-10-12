package Searching;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MedianOfTwoSortedArrays {

    public static int Solution(int[] arr) {
        int n = arr.length;

        // If length of array is even
        if (n % 2 == 0) {
            int z = n / 2;
            int e = arr[z];
            int q = arr[z - 1];

            int ans = (e + q) / 2;
            return ans;
        }

        // If length if array is odd
        else {
            int z = Math.round(n / 2);
            return arr[z];
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int i = sc.nextInt();
        System.out.println("m");
        int j = sc.nextInt();

        // TODO Auto-generated method stub
        int[] arr1 = new int[i];
        int[] arr2 = new int[j];
        System.out.println("NE");

        for (int n = 0; n < i; n++) {
            arr1[n] = sc.nextInt();
        }
        System.out.println("ME");

        for (int n = 0; n < i; n++) {
            arr2[n] = sc.nextInt();
        }
        int[] arr3 = new int[i + j];

        // Merge two array into one array
        System.arraycopy(arr1, 0, arr3, 0, i);
        System.arraycopy(arr2, 0, arr3, i, j);

        // Sort the merged array
        Arrays.sort(arr3);

        // calling the method
        System.out.print(Solution(arr3));
    }
}
// String.format("%.2f",
