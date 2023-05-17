class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertAtPosition {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);
        head.next.next.next = new Node(35);
        head = insertPos(head, 10, 6);
        printList(head);
    }

    public static Node insertPos(Node head, int data, int pos) {
        Node curr = head;
        Node temp = new Node(data);

        if (pos == 1) {
            temp.next = curr;
            return temp;
        }
        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
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
