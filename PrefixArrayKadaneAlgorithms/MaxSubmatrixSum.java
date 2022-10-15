package PrefixArrayKadaneAlgorithms;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaxSubmatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
            int x = maxSumSub(n, m, arr);

            System.out.print(x);
        }
    }

    public static int maxSumSub(int R, int C, int[][] a) {
        int sum[] = new int[R];
        int maxSum = Integer.MIN_VALUE;
        for (int cStart = 0; cStart < C; cStart++) {
            Arrays.fill(sum, 0);
            for (int cEnd = cStart; cEnd < C; cEnd++) {
                for (int row = 0; row < R; row++) {
                    sum[row] += a[row][cEnd];
                }
                int curMaxSum = kadans(sum);
                maxSum = Math.max(maxSum, curMaxSum);
            }
        }
        return maxSum;
    }

    public static int kadans(int a[]) {
        int size = a.length;
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < size; i++) {
            curSum = curSum + a[i];
            if (max < curSum) {
                max = curSum;
            }
            if (curSum < 0) {
                curSum = 0;
            }

        }
        return max;
    }
}