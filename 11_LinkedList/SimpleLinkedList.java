// 1. Simple LinkedList Implementation in Java
class Node {
    int data;
    Node next; // Self referntail stuructures

    Node(int x) {
        data = x;
        next = null; // this is optional in java
    }
}

public class SimpleLinkedList {
    public static void main(String[] args) {
        // Node head = new Node(10);
        // Node temp1 = new Node(20);
        // Node temp2 = new Node(30);

        // head.next = temp1;
        // temp1.next = temp2;

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head);
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
    }
}
