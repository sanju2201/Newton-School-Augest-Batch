class Calculator implements CalculatorInterface {
    int num1;
    int num2;

    Calculator(){
        this.num1 = 0;
        this.num2 = 0;
    }
    Calculator(int a,int b){
        this.num1 = a;
        this.num2 = b;
    }
    public int add(){
        return num1+num2;
    }
    public int add(int a,int b){
        return a+b;
    }
    public int sub(){
        return num1-num2;

    }
    public int sub(int a,int b){
     return a-b;
    }
}
