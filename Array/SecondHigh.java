package Array;

public class SecondHigh {
    public static void main(String[] args) {
        int a[] = { 10, 12, 15, 8 };
        int high = 0, sec = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= high) {
                sec=high;
                high = a[i];
            // } else {
            //     sec = a[i];
            // }
        }
        System.out.println(sec);
    }

}
