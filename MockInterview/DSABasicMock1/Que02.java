package MockInterview.DSABasicMock1;

import java.util.*;

public class Que02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 3, 2, 1, 5, 6, 4 };
        int n = a.length;
        int k = 3;

        // Sorting
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // for kth Element
        System.out.println("Kth element  " + a[n - k]);

    }

}
