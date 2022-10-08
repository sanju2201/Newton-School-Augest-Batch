package MockInterview.DSABasicMock1;

import java.util.*;

public class Que01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 5, 7, 2, 4, 9, 6 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max==>" + max);
        System.out.println("Min==>" + min);

    }
}
