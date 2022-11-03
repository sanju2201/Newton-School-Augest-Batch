package MockInterview.DSABasicMock1;

import java.util.*;

public class Mock3 {
    public static void main(String[] args) {
        int a[] = { 1, 3, 3, 4, 4, 4 };

        int n = a.length;
        Arrays.sort(a);

        int j = 1;
        int thirdLargest = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                j++;

                if (j == 3) {
                    thirdLargest = a[i];
                }
            }
        }
        System.out.println(thirdLargest);

    }

}
