// 7. LinkedList Traversal using recurion. 

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class RecursiveTraversalOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        traversal(head);
    }

    public static void traversal(Node head) {
        if (head == null)
            return;
        System.out.print("->" + head.data);
        traversal(head.next);
    }
}
