import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       while(true){
           int num = sc.nextInt();
           if(num ==0){
               break;
           }
          System.out.print(num+" ");
       }
        System.out.print(0);
    }
}
