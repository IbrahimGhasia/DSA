class Node {
    int data;
    Node prev;
    Node next;

    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}

public class SimpeDoublyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node q1 = new Node(20);
        Node q2 = new Node(30);
        head.next = q1;
        q1.next = q2;
        q1.prev = head;
        q2.prev = q1;
    }
}
