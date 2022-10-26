import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x = x;
            this.y = y;
        }

        int getX(){
            return this.x;
        }

        int getY(){
            return this.y;
        }
        void setX(int x){
            this.x = x;
        }

        void setY(int y){
            this.y = y;
        }

    }

    public static void main (String[] args) {
    Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
     int k = sc.nextInt();

     Pair arr[] = new Pair[n];
      for(int i=0;i<n;i++){
          int t=sc.nextInt();
          arr[i]=new Pair(t,0);
      }

      for( int i=0;i<n;i++){
          int p=sc.nextInt();
          arr[i].setY(p);
      }

      Arrays.sort(arr,new Comparator <Pair>(){
          @Override public int compare(Pair p1,Pair p2){
              if(p2.x-p1.x==0){
                  return p2.y-p1.y;
              }
              return p2.x-p1.x;
          }
      });
      for(int i=0;i<k;i++){
          System.out.println(arr[i].getX()+ " "+ arr[i].getY());
      }
    }
}
