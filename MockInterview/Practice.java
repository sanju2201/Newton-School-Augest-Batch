package MockInterview;

import java.util.*;

public class Practice {

    // Insertion Sort Algoritm
    public static int[] insertionSort(int arr[], int n) {

        return arr;
    }

    // Bubble Sort Algorithm
    public static int[] bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Binary Search Algorithm
    public static void binarySearch(int arr[], int l, int r, int k) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                System.out.println("Element is found at position " + (mid + 1));
                return;
            }
            if (arr[mid] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println("Element is not Avbailable");
    }

    // Linear Search Algorithm
    public static void linearSearch(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.print("Element present at position " + (i + 1));
                return;
            }
        }
        System.out.print("Element is Not Available");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input for the Array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to be find = k
        // int k = sc.nextInt(); // UNCOMMENT IT FOR PERFORMING SEARCHING (70 No Line)
        // Call the funtion Linear Search
        // linearSearch(arr, n, k);

        // Call the Binary Search Function
        // binarySearch(arr, 0, n - 1, k);

        // Call the Functio for Appling Bubble Sort
        // bubbleSort(arr, n);
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }

        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
