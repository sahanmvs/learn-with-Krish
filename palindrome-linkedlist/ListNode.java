package Reverse;

public class ListNode {
    static Node head;

    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
        }
    }

    public boolean isPalindrome(Node head) {
        Node fast = head;
        Node slow = head;

        // fast moves two nodes at a time and reach end while slow reaches mid
        while (fast != null & fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow); // reverse right side, d a m => m a d
        fast = head;

        while (slow != null) {
            if(slow.data != fast.data)
                return false;

            slow = slow.next;
            fast = fast.next;
        }

        return true;
    }

    public Node reverse(Node head) {
        Node prev = null;
        while(head != null) {
            Node nextNode = head.next;
            head.next =  prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }

    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.head = new Node('m');
        Node second = new Node('a');
        Node third = new Node('d');
        Node fourth = new Node('a');
        Node fifth  = new Node('m');

        listNode.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

//        listNode.printList(head);
//        System.out.println("");
//        Node node = listNode.reverse(head);
//        listNode.printList(node);
        System.out.println(listNode.isPalindrome(head));
    }
}
