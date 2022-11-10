package stack;

public class StackFromArray {
    public int arr[];
    public int capacity;
    public int top;

    public StackFromArray(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    public void push(int data){
        if(top == capacity-1){
            System.out.println("Stack is Full");
            return;
        }

        top++;
        arr[top] = data;
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }

        int res = arr[top];
        return res;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stsck is Empty");
            return -1;
        }

        int res = arr[top];
        top--;
        return res;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackFromArray stk = new StackFromArray(10);
        stk.push(56);
        stk.push(58);
        stk.push(45);
        System.out.println(stk.pop());
        System.out.println(stk.isEmpty());
        System.out.println(stk.peek());

    }





}
