// create class here and its methods as well
class SumCalculator{
    public int num1;
    public int num2;

    SumCalculator(int x, int y){
        this.num1=x;
        this.num2=y;
    }

    public int sum (){
        return num1+num2;
    }

    public int sum2(int a,int b){
        return a+b;
    }

    public int fromObject(SumCalculator obj1, SumCalculator obj2){
        return obj1.sum() +obj2.sum();
    }

}
