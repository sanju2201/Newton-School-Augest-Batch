import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.io.IOException;
import java.io.BufferedReader;

// don't change the name of this class
// you can add inner classes if needed
class Main {
   // @SuppressWarnings("unchecked")
    public static void main (String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] line1=br.readLine().split(" ");
        int q=Integer.parseInt(line1[0]);
        int k=Integer.parseInt(line1[1]);
        int[] arr=new int[q];
        int size=0;
        while(q-->0){
            String[] line=br.readLine().split(" ");
            int x=Integer.parseInt(line[0]);
            if(x==1){
                int n=Integer.parseInt(line[1]);
                arr[size++]=n;
            }
            else{
                int sum=0;
                if(size<k){
                    for(int i=0;i<size;i++){
                        sum+=arr[i];
                    }
                    System.out.println(sum);
                }else{
                    for(int i=size-k;i<size;i++){
                        sum+=arr[i];
                    }
                    System.out.println(sum);
                }
            }
        }
    }
}

// https://my.newtonschool.co/playground/code/apr4iy4cmtpb
