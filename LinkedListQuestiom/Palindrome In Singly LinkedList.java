/*
class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}
*/
public static boolean IsPalindrome(Node head) {
if(head.next == null){
    return true;
}
else if(head.next.next == null){
    if(head == head.next){
        return true;
    }
    else{
        return false;
    }
}
Node mid = middle(head);
Node last = reverse(mid.next);
Node cur = head;
while(last != null){
    if(last.val != cur.val){
        return false;
    }
    last = last.next;
    cur = cur.next;
}
return true;
}
public static Node reverse(Node head){
    Node cur = head;
    Node pre = null;
    while(cur != null){
        Node temp = cur.next;
        cur.next = pre;
        pre = cur;
        cur = temp;
    }
    return pre;
}

public static Node middle(Node head){
    Node slow =head;
    Node fast = head;
while(fast !=null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}
return slow;
}
