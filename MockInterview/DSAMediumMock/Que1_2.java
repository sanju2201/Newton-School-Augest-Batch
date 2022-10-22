package MockInterview.DSAMediumMock;

import java.util.*;

public class Que1_2 {
    public static int[] mergeSort(int a[], int l, int r) {

        if (l < r) {
            int mid = l + (r - l) / 2;

            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
        return a;

    }

    public static void merge(int a[], int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = a[l + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = a[mid + 1 + i];
        }
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = R[j];
            j++;
            k++;
        }

    }

    public static void reverse(int a[], int n) {
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        // Taking Input
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Printing Input
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        mergeSort(a, 0, n - 1);

        // Printing After Sorting
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        reverse(a, n);
        // // Printing Reverse

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
