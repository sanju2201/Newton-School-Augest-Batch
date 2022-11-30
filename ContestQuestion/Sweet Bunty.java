import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int s = sc.nextInt();
     int b = sc.nextInt();

     b =  b-2;
     b = Math.floorDiv(b,2);
     int max = b*(b+1)/2;

     if(max>s){
         System.out.print(s);
     }
     else{
     System.out.print(max);
    }
}
}

// https://my.newtonschool.co/playground/code/70x964p5w7jc/
