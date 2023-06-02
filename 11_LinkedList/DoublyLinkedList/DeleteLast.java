class Node {
    int data;
    Node next;
    Node prev;

    Node(int x) {
        data = x;
    }
}

public class DeleteLast {
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

        printList(deleteLast(head));
    }

    public static Node deleteLast(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.prev.next = null;
            return head;
        }
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print("->" + curr.data);
            curr = curr.next;
        }
    }
}
