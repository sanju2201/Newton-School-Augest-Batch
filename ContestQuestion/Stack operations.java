public static void push(Stack<Integer> st, int x)
    {
        st.push(x);
    }

    // Function to pop element from stack
    public static void pop(Stack<Integer> st)
    {
    if(!st.isEmpty()){
        st.pop();
    }
    }

    public static void top(Stack<Integer> st)
    {
        if(!st.isEmpty()){
            System.out.println(st.peek());
        }
        else{
            System.out.println(0);
        }
    }

// https://my.newtonschool.co/playground/code/1v9ku68ilpt5/
