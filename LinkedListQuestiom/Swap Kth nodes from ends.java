/*
// Information about the class Node
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
// Should swap Kth node from beginning and Kth
// node from end in list and return new head.
    static Node swapkthnode(Node head, int num, int K)
    {
        if(K > num) return head;
        if(2*K-1 == num) return head;
    
        Node x_prev = null;
        Node x = head;
    
        Node y_prev = null;
        Node y = head;
    
        int count = K-1;
        while(count-- > 0){
        x_prev = x;
        x = x.next;
        }
    
        count = num - K;
        while(count-- > 0){
        y_prev = y;
        y = y.next;
        }
    
        if(x_prev != null)
            x_prev.next = y;
        if(y_prev != null)
            y_prev.next = x;
        
        Node temp = x.next;
        x.next = y.next;
        y.next = temp;
    
        if(K == 1)
         head = y;
        if(K == num)
            head = x;
        return head;    
    }

// https://my.newtonschool.co/playground/code/p6bwu8xjqwju/
