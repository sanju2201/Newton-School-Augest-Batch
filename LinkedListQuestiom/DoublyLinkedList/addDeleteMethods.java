package LinkedListQuestiom.DoublyLinkedList;

import java.util.*;

public class addDeleteMethods {

    Node head;

    class Node {
        String data;
        Node next;
        Node prev;

        Node(String str) {
            str = data;
            next = null;
            prev = null;
        }
    }

    // delete first
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        head = head.next;
        head.prev = null;

    }

    // delete last
    public void removeLast() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next.prev = null;
        ptr.next = null;

    }

    // addNodeAfterGivenNode (node,data)

    public void addNodeAfterGivenNode(String data, int position) {
        Node newNode = new Node(data);
        int i = 0;
        Node ptr = head;
        while (ptr != null) {
            i++;
            if (i == position) {
                newNode.prev = ptr;
                newNode.next = ptr.next;
                ptr.next = newNode;
                ptr.next.prev = newNode;
                return;
            }
            ptr = ptr.next;
        }
        if (i < position) {
            System.out.println("No Node Available");
        }
    }

    // delete a particular node (node)

    public void deleteParticularNode(int position) {
        int i = 0;
        Node ptr = head;
        while (ptr != null) {
            i++;
            if (i == (position - 1)) {
                ptr.next = ptr.next.next;
                ptr.next.next.prev = ptr;

                return;
            }
            ptr = ptr.next;
        }
        if (i < position) {
            System.out.println("No Node Available");
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data); // [null,Hello,abc/null]
        newNode.next = head; // Hello-> Something
        if (head != null) {
            head.prev = newNode; // something->Hello
        }
        head = newNode; // head->hello

    }

    public void printList() {

        Node ptr = head;
        System.out.print("null");
        while (ptr != null) {
            System.out.print("<-" + ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.print("null");

    }

    public void addLast(String data) {

        Node newNode = new Node(data); // newNode -> [null,Newton,null]

        if (head == null) { // empty list //base
            head = newNode;
            return;
        }

        // List is not empty , head is not null
        Node ptr = head; // ?
        while (ptr.next != null) { // reach till last node
            ptr = ptr.next;
        }

        // ptr-> hello -> Newton
        ptr.next = newNode;
        newNode.prev = ptr;
    }

    public static void main(String[] args) {
        addDeleteMethods obj = new addDeleteMethods();

        obj.addFirst("my");
        obj.addFirst("name");
        obj.addFirst("is");
        obj.addLast("is");
        obj.addLast("is");
        obj.addLast("is");

        // obj.removeFirst();
        // obj.removeFirst();

        obj.printList();

    }

}
