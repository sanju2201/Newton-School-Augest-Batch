package divide_conquer;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = maxSum(a, 0, n - 1);
        System.out.println(max);
    }

    public static int maxSum(int[] a, int l, int r) {
        int m = 0;
        if (l > r)
            return Integer.MIN_VALUE;
        if (l == r) {
            return a[l];
        }
        if (l < r) {
            m = l + (r - l) / 2;

            // maxSum(a,l,m-1);
            // maxSum(a,m+1,r);
            // maxCrossingSum(a,l,m,r);
        }
        return Math.max(Math.max(maxSum(a, l, m - 1), maxSum(a, m + 1, r)), maxCrossingSum(a, l, m, r));

    }

    public static int maxCrossingSum(int[] a, int l, int m, int r) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = m; i >= l; i--) {
            sum = sum + a[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = m; i <= r; i++) {
            sum = sum + a[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }

        return Math.max((leftSum + rightSum - a[m]), (Math.max(leftSum, rightSum)));
    }
}
