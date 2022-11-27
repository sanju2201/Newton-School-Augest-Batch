import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pow[] = new int[n];
    
    for(int i=0;i<n;i++){
      pow[i] = sc.nextInt();
    }
     Arrays.sort(pow);
    int i=0;int count =0; int j=i+1;
    while(j<n){
        if(pow[j]>pow[i]){
            count++;
            i++;
            j++;

        }
        else{
            j++;
        }
    }
    System.out.println(n-count);

    }
}

//https://my.newtonschool.co/playground/code/g0xxfoj54zgm/
