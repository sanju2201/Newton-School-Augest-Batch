import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int maxCirculerSum(int a[], int n){
        int sum=0;
        if(n==1){
            return a[0];
        }
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        int curMax =a[0];
        int maxSoFar=a[0];
        int curMin = a[0];
        int minSoFar =a[0];
        
        for(int i=1;i<n;i++){
            curMax =Math.max(curMax+a[i],a[i]);
            maxSoFar = Math.max(maxSoFar,curMax);
            curMin = Math.min(curMin +a[i], a[i]);
            minSoFar = Math.min(minSoFar ,curMin);
        }
        if(minSoFar == sum){
            return maxSoFar;
        }
        return Math.max(maxSoFar , sum-minSoFar);
    }

    public static void main (String[] args)throws IOException {
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    while(t-->0){
        String line1 =br.readLine();
        String []str1 = line1.trim().split(" ");
        int n=Integer.parseInt(str1[0]);
        int []arr = new int [n];
        String line2=br.readLine();
        String []str2 = line2.trim().split("\\s+");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(str2[i]);
        }
        System.out.println(maxCirculerSum(arr,n));
    }
    }
}
