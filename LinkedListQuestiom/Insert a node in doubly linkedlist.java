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


public static Node insertnew(Node head,int x) { 
       Node root=new Node(x);
        if(head==null){
            return root;
        }

        Node curr=head;
        Node temp=null;

        if(x<=head.val){
            root.next=head;
            head.prev=root;
            head=root;
            return head;
        }

        while(curr!=null && curr.val<=x){
            temp=curr;
            curr=curr.next;
        }

        temp.next=root;
        root.next=curr;

        if(curr!=null){
        curr.prev=root;
        }
        root.prev=temp;
        return head;
    }
