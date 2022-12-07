import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      float a = sc.nextFloat();
       float b = sc.nextFloat();

    if (a <= b)
    {
        float temp = a;
        a = b;
        b = temp;
    }
     
    // First Ratio
    String ratio1 = String.format("%.3f", a / b);
     
    // Second Ratio
    String ratio2 = String.format("%.3f", (a + b) / a);
     
    // Condition to check that two
    // numbers are in golden ratio
    if (ratio1.equals(ratio2) &&
        ratio1.equals("1.618"))
    {
        System.out.println("Yes");
      
    }
    else
    {
        System.out.println("No");  
       
}
    }
}




// 2nd Way using format conversion

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.text.DecimalFormat;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
      float a = sc.nextFloat();
       float b = sc.nextFloat();

        if(a>b){
            float  x = Float.valueOf(df.format((a/b)));
            float  x1 = Float.valueOf(df.format((a+b)/a));
            if(x == x1){
                System.out.println("Yes");

            }
            else{
                System.out.println("No");
            }
        }
        else{
             float  x = Float.valueOf(df.format((b/a)));
            float  x1 = Float.valueOf(df.format((a+b)/b));
             if(x == x1){
                System.out.println("Yes");

            }
            else{
                System.out.println("No");
            }
        }
    }
}
