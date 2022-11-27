import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void interviewPass(int arr[], int n, int x, int k){
        int sum =0;
        for(int i=0;i<k;i++){
            sum+= arr[i];
        }
        if(sum>=x){
            System.out.println("YES");
            return;
        }

        for(int i=k;i<n;i++){
            sum = sum -arr[i-k] +arr[i];
            if(sum>=x){
                System.out.println("YES");
            return;
            }
        }
        System.out.println("NO");
    }
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int x = sc.nextInt();
       int k = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }

       interviewPass(arr,n,x,k);

    }
}

// https://my.newtonschool.co/playground/code/f3uyw76yp0fe/
