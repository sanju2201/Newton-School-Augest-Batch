static class Student
{
    String name;
    int eng;
    int maths;
    int hindi;
}
static Student[] createStudentArray(int n)
    {
        Student arr[]= new Student [n];
        for(int i=0;i<n;i++){
            arr[i]= new Student();
            arr[i].name = sc.next();
            arr[i].eng = sc.nextInt();
            arr[i].maths = sc.nextInt();
            arr[i].hindi = sc.nextInt();

        }
        return arr;
      
    }
    
    static int engAverage(Student st[], int n)
    {
        int avg =0;
        for(int i=0;i<n;i++){
            avg = avg+st[i].eng;
        }
        return avg/n;
    }
    
    static int avgPercentageOfClass(Student st[], int n)
    {
       int sum=0;
       int avg =0;
       for(int i=0;i<n;i++){
           sum=0;
           sum=st[i].eng +st[i].maths + st[i].hindi;
           avg = avg +sum/3;
       }
       return avg/n;
    }
