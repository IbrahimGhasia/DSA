class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
    }
}

public class InsertAtEndDoublyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        System.out.println("Original List: ");
        printList(head);
        head = insertAtEnt(head, 40);
        System.out.println("\nAfter inserting 40 to the end of the List: ");
        printList(head);
    }

    public static Node insertAtEnt(Node head, int data) {
        Node temp = new Node(data);
        if (head == null)
            return temp;

        Node curr = head;
        while (curr.next != null)
            curr = curr.next;

        curr.next = temp;
        temp.prev = curr;

        return head;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
    }
}
