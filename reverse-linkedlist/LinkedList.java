package Reverse;

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public Node reversList(Node head) {
        Node prev = null;

        while(head != null) {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }

    public void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.printList(head);
        Node node = list.reversList(head);
        System.out.println("l");
        list.printList(node);
    }
}
