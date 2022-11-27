import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String[]s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        long maxSum = 0; 
        int index = -1;
        long sum = 0;
        //HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            sum = 0;
            String []s1 = br.readLine().split(" ");
            for(int j = 0; j < m; j++){
                int x =  Integer.parseInt(s1[j]);
                sum += x;
            }
          // System.out.println(sum);
           // map.put(sum, i);
            if(sum > maxSum){
                maxSum = sum;
                index = i;
            }
        }
      // System.out.println(maxSum);
       // int index = map.get(maxSum);
        System.out.println(index+1);
    }
}

// https://my.newtonschool.co/playground/code/4lffrhe3oqlo/
