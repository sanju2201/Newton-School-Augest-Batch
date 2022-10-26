import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

public static void linearProbing(int a[],int n,int hashSize){
    HashMap <Integer,Integer> map = new HashMap<>();
    for(int i=0;i<n;i++){
        int modVal = a[i]%hashSize;
        if(map.containsKey(modVal)){
            for(int j=1;j<hashSize;j++){
                modVal = (a[i]+j)%hashSize;
                if(!map.containsKey(modVal)){
                    map.put(modVal,a[i]);
                    break;
                }
            }
        }
        else{
            map.put(modVal,a[i]);
        }
    }
    for(int i=0;i<hashSize;i++){
        if(map.containsKey(i)){
            System.out.print(map.get(i)+" ");
        }
        else{
            System.out.print(-1+" ");
        }
    }
}

    public static void main (String[] args) {
    System.gc();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int hashSize = sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        linearProbing(a,n,hashSize);
        System.out.println();
        
    }

    }
}
