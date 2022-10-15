package LinkedListQuestiom;

public class LinkedlistClassNotes {

    // head ->[rohit,4545]->[mohit,23432]->[hello,null]

    Node head;
    static int size = 0;

    // Node [ data, next]

    // [1, refe of nest Node]->[2,]->3->4->5->null

    public static class Node {
        String data;// any datatype
        Node next; // next is reference to store the address of next Node

        // function - constructo -
        // write by yourslef
        Node(String str) {
            data = str;
            next = null;
            size++;
        }
    }


    // newNode = [School,null]
    // head=rbc -> [I,xyz] -> [Love,abc] -> [Newton,trt] ->[School,null]
    // ptr=abc
    public void addLast(String data) {
        Node newNode = new Node(data); // newNode -> [Nice,null]

        if (head == null) { // empty list //base
            head = newNode;
            return;
        }

        // List is not empty , head is not null
        Node ptr = head; // ?
        while (ptr.next != null) { // reach till last node
            ptr = ptr.next;
        }

        ptr.next = newNode;
    }

    // st1 st2 st3 st4 st 5.........

    // head=rbc -> [I,xyz] -> [Love,abc] -> [Newton,trt] ->[School,null]
    // ptr=null
    public void printList() {
        Node ptr = head;
        // System.out.println(ptr);
        while (ptr != null) {
            // System.out.println(ptr);
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.print("null");
    }

    // head = abc -> [Hello,abc] -> I->Love->Newton->School->null
    // head-^

    // // newNode -> [Hello,null]
    public void addFirst(String data) {
        Node newNode = new Node(data); // newNode -> [Hello,null]
        newNode.next = head;
        head = newNode;
    }

    public int getSize() {
        return size;
    }
    // Hello->I->Love->Newton->School->Because->Its->Nice->null
    // head=xyz

    // head->Hello->I->Love->Newton->School->Because->Its->Nice->null
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        size--;
        head = head.next;// null pointer exception
    }

    // [Hello,abc]->[I,xyz]->[Love,trh]->Newton->School->Because->Its,null->Nice->null
    // ptr

    // Hello->I->Love->Newton->School->Because->Its->null
    public void removeLast() {

        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }

        //
        size--;

        if (head.next == null) { // only 1 node
            head = null;
            return;
        }
        // head-> null
        // ptr

        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    // Hello->I->Love->Newton->School->Because->Its->null =>7
    // 1 2 3 4 5 6 7 8
    // ptr

    // [Delhi,abc]

    public void addSomewhere(String data, int position) // delhi ,1 - addfirst
    {

        if (position < 1 || position > size + 1) {
            System.out.println("Not valid position");
            return;
        }
        // position is valid

        Node newNode = new Node(data); // newNode -> [Delhi,null]

        if (position == 1) { // add first
            newNode.next = head;
            head = newNode;
            return;
        }

        Node ptr = head;
        for (int i = 1; i < position - 1; i++) {// 1 // to reach 1 position back
            ptr = ptr.next;
        }

        newNode.next = ptr.next; // delhi->newton
        ptr.next = newNode; // love -> delhi

    }

    public void deleteMiddle() {

    }

    // I->Love->Newton->School->null
    public static void main(String[] args) {

        LinkedlistClassNotes obj = new LinkedlistClassNotes();

        // head-> [I,x]->[Love,y]->[Newton,z]->[School,null]
        obj.addLast("I");
        obj.addLast("Love");
        obj.addLast("Newton");
        obj.addLast("School");//
        obj.addLast("Because");//
        obj.addLast("Its");//
        obj.addLast("Nice");//

        // printing the linked list
        obj.printList(); // I -> Love -> Newton -> School -> null

        obj.addFirst("Hello");
        obj.addFirst("Sir");
        System.out.println();
        obj.printList();
        // Sir->Hello->I->Love->Newton->School->Because->Its->Nice->null

        System.out.println();
        System.out.println(obj.getSize());

        obj.removeFirst();
        System.out.println();
        obj.printList();
        System.out.println();
        System.out.println(obj.getSize());

        obj.removeLast();
        System.out.println();
        obj.printList();

        // Hello->I->Love->Delhi->Newton->School->Because->Its->null
        // 1 2 3 4
        obj.addSomewhere("Delhi", 4);// first, last, middle,index
        System.out.println();
        obj.printList();

        obj.addSomewhere("Punjab", 1);// first, last, middle,index
        System.out.println();
        obj.printList();

        obj.addSomewhere("Hyderabad", 2);// first, last, middle,index
        System.out.println();
        obj.printList();

        // System.out.println(obj.getSize());

        obj.addSomewhere("Bangalore", 11);// first, last, middle,index
        System.out.println();
        obj.printList();

        System.out.println();
        obj.addSomewhere("Bangalore", 0);// first, last, middle,index
        obj.addSomewhere("Bangalore", 14);// first, last, middle,index

        // Punjab->Hyderabad->Hello->I->Newton->School->Because->Its->Bangalore->null
        obj.deleteMiddle(); // HW //delhi
        obj.deleteMiddle(); // HW //Love

 
    }
}