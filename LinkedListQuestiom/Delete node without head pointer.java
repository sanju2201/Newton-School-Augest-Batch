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

public static void deleteNode(Node D) {
Node temp = D.next;
D.val = temp.val;
D.next = temp.next;
temp = null;
}

// https://my.newtonschool.co/playground/code/c83abu3odjhb/
