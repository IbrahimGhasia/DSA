class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsetAtFront {
    public static void main(String[] args) {
        Node head = null;
        head = insertAtFirst(head, 30);
        head = insertAtFirst(head, 20);
        head = insertAtFirst(head, 10);
        printList(head);
    }

    // Time Complexity is O(n)
    static Node insertAtFirst(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
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
