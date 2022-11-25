/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/
public static Node deleteElement(Node head,int k) {
 if( k<1 ) return head;

        Node ptr = head;
        Node ptr1=head;
        int t=1;
        while(ptr1.next!=null){
            ptr1=ptr1.next;
            t++;
        }
        if(k==t){
            head = head.next;
            return head;
        }

        while(ptr.next!=null){
            ptr=ptr.next;
            t++;
        }
        
        if(k>t)return head;
        
        if(k==1){
            Node a = ptr.prev;
            a.next = null;
            return head;
        }

        while(--k>0){
            ptr=ptr.prev;

        } 

        Node x = ptr.next;
        x.prev = ptr.prev;

        Node y = ptr.prev;
        y.next = ptr.next; 

        return head; 
    }
