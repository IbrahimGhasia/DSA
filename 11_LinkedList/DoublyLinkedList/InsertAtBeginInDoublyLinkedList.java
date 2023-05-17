class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
    }
}

public class InsertAtBeginInDoublyLinkedList {
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
        head = insertFront(head, 0);
        System.out.println("\nInserting Node 0 at the front: ");
        printList(head);
    }

    public static Node insertFront(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null)
            head.prev = temp;
        return temp;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
    }

}
