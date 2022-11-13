import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
    String str = sc.next();
    int r=0,e=0,d=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='r'){
            r=1;
        }
        else if(str.charAt(i)=='e'){
            e=1;
        }
        else if(str.charAt(i)=='d'){
            d=1;
        }
    }
    int ans = r+e+d;
    if(ans==3){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    }
}
