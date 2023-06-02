class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
    }

}

public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);

        head.next = temp1;

        temp1.next = temp2;
        temp1.prev = head;

        temp2.next = temp3;
        temp2.prev = temp1;

        temp3.prev = temp2;

        printList(reverse(head));
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            prev = curr.prev; // Swapping logic
            curr.prev = curr.next; // we are just adjusting prev and next
            curr.next = prev; // the prev of node becomes next and vice versa, this is how dLL will get
                              // reversed

            curr = curr.prev;
        }
        return prev.prev;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
    }
}