import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int Priority(char ch){
        switch(ch){
            case '+':
            case '-':
            return 1;

            case '*':
            case '/':
            return 2;

            case '^':
            return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String str){
        // initializing empty string for store the infixToPostfix
        String result = new String("");

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);

            // if the scanned character is Operand add it to output
            if(Character.isLetterOrDigit(c)){
                result += c;
            }
            // if the scanned character is ( opening bracket add it to stack
             else if(c=='('){
                stack.push(c);
            }

            // if the scanned character is ) closing bracket, pop all the element from the stack until getting a ( opening bracket
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                 result += stack.pop();
                 //stack.pop();
                }
                stack.pop();
            }

            // if a operator is encountered
            else{
                while(!stack.isEmpty() && Priority(c) <= Priority(stack.peek())){
                    result +=  stack.pop();
                   // stack.pop();
                 }
                 stack.push(c);

            }
        }

        // at the end pop all the operator from the stack
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                return "Invalid Expression";
            }
            result += stack.pop();
            //stack.pop();
        }
        return result;
    }

    public static void main (String[] args) {
     Scanner sc = new Scanner(System.in);
     String str = sc.next();
     System.out.print(infixToPostfix(str));
    }
}
