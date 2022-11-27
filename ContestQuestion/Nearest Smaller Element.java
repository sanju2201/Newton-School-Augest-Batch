import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void findPrev(int a[],int n){
        if(a==null || n==0){
            return;
        }
        for(int i=0;i<n;i++){
            int prev = -1;
            for(int j=i-1;j>=0;j--){
                if(a[j]<=a[i]){
                    prev = a[j];
                    break;
                }
            }
            System.out.print(prev+" ");
        }

    }

    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    findPrev(a,n);

    }
}

// https://my.newtonschool.co/playground/code/jcgl4skhfxh3/
