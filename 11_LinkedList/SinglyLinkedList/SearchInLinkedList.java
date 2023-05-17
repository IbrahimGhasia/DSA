class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class SearchInLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int pos = search(head, 10);
        System.out.println(pos);
    }

    public static int search(Node head, int key) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == key)
                return pos;
            else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
}
