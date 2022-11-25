import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int minLengthSubsequesnce(String str){
        int n = str.length();
        if(n<26){
            return -1;
        }
        int ans = Integer.MAX_VALUE;
        int k=26;
        
        Deque<Integer> dq[] = new ArrayDeque[k];
        for(int i=0;i<k;i++){
            dq[i] = new ArrayDeque<>();
        }

        for(int i=0;i<n;i++){
            int ch = str.charAt(i)-'a'; // taking ACSII values
            dq[ch].addLast(i);
        }

        while(!dq[0].isEmpty()){
            int start = dq[0].getFirst();
            dq[0].removeFirst();

            boolean flag = true;
            int preIdx = start;
            for(int i=1;i<k;i++){
                while(!dq[i].isEmpty()&& dq[i].getFirst()<preIdx){
                    dq[i].removeFirst();
                }
                if(dq[i].isEmpty()){
                    flag =false;
                    break;
                }
                preIdx = dq[i].getFirst();
            }
            if(!flag){
                break;
            }
            ans = Math.min(ans,preIdx-start+1);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(minLengthSubsequesnce(str));
    }
}
