import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int arr[][]=new int [m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
    }
     System.out.println(maxSum(arr,m,n));
    }

  public static int maxSum(int[][]a,int m,int n){
      int result = a[0][0];
      for(int i=0;i<m;i++){
          int curRow []=new int [n];
          for(int j=i;j<m;j++){
              for(int k=0;k<n;k++){
                  curRow[k] += a[j][k];
              }
              int max= curRow[0]; int min =0;int preSum =0;
              for( int num : curRow){
                  preSum += num;
                  max =Math.max(max, preSum-min);
                  min =Math.min(min , preSum);
              }
              result = Math.max(result, max);
          }
      }
      return result;

    }
}
