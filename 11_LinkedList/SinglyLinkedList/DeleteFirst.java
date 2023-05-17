import DoublyLinkedList.Node;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class DeleteFirst {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println("Before: ");
        printList(head);
        System.out.println("\nAfter: ");
        head = deleteFirst(head);
        printList(head);
    }

    public static Node deleteFirst(Node head) {
        if (head == null)
            return null;
        else
            return head.next;
    }

    public static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
    }

}
