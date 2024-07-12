package LL;

public class LinkedList2 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static Node head;
    public Node tail;
    // * Floyd's Cycle Finding Algorithm
    public boolean isCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void removeCycle(Node head) {
        

        //* */ Detect Cycle
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        
        if (cycle == false) {
            return;
        }
        // ^ Finding the meeting point
        slow = head;
        Node prev = null; // last node 

        while (slow != fast) {

            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        // remove cycle -> last.next = null
        prev.next = null;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        LinkedList2 list = new LinkedList2();
        boolean hasCycle = list.isCycle(head);
        System.out.println(hasCycle);
        list.removeCycle(head);
        boolean hasCycle2 = list.isCycle(head);
        System.out.println(hasCycle2);

    }
}
