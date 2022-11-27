import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
     public static int minimumFlip(String s){
         int n = s.length();
         s = s+s;
         char t[] = s.toCharArray();
         char a[] = new char[n+n];
         char b[] = new char[n+n];
         for(int i=0;i<n+n;i++){
             if(i%2==0){
                 a[i] ='1';
                 b[i] ='0';
             }
             else{    
                  a[i] ='0';
                  b[i] ='1';
             }
         }

         int first =0;int second =0; int ans = Integer.MAX_VALUE;
         for(int i=0;i<n+n;i++){
             if(a[i]!=t[i]){
                 first++;
             }
             if(b[i]!=t[i]){
                 second++;
             }
             if(i>=n-1){
                 ans = Math.min(ans,Math.min(first,second));
             }
         }
         return ans;
     }
     
    public static void main (String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String s = br.readLine();
     System.out.println(minimumFlip(s));

    }
}

// https://my.newtonschool.co/playground/code/hhd1vsxc8vud/
