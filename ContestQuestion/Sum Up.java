import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     // checking 1st no even or odd
     if(a%2 != 0){
         a++;
     }

     // sum of all even divisor from a to b
     long sum =0;
     for(int i=a;i<=b;i++){
         int j =i;
         while(j%2==0){
             sum += j;
             j /=2;
         }
     }
    System.out.println(sum);
    }
}

// https://my.newtonschool.co/playground/code/b0cfa7lzn3yj/
