package LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void addFirst(int d) {
        
        Node newNode = new Node(d);

        if (head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }
    
}
