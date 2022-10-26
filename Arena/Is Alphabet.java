import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }

    }
}
