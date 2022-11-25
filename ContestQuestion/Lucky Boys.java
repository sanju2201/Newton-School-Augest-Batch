import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    int b[]= new int[m];
    for(int i=0;i<n;i++){
        a[i]= sc.nextInt();
    }
    for(int i=0;i<m;i++){
        b[i] = sc.nextInt();
    }

    Arrays.sort(a);
    Arrays.sort(b);

    int count =0;
    int j=0,i=0;
    int x=0;
    while(j<m && i<n ){
        if(Math.abs(b[j]-a[i])<=k){
      // if(b[j]>=a[i]-k && b[j]<=a[i]+k){
            count++;
            i++;
            j++;
            continue;
        }
        else{
            if(a[i]>b[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }

    System.out.println(count);
    }
}
