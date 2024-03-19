
public class Practice {
  public static void main(String[] args) {
    Node n1 = new Node(2, null);
    System.out.println(n1.data);
    LinkedList l1 = new LinkedList();
    l1.head = n1;

    l1.printLL();
  }
}

class Node {
    int data;
    Node next;

    Node(int d, Node n) {
        this.data = d;
        this.next = n;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }
    
    void addNode(int data) {
        Node node = new Node(data, null);
        if (this.head == null) {
            this.head = node;
        } else {
            Node itr = this.head;

            while (itr != null & itr.next != null) {
                itr = itr.next;
            }

            itr.next = node;
        }
    }
    
    void printLL() {
        Node itr = this.head;
        if (itr != null) {
            
            while (itr != null) {
                System.out.println(itr.data);
                itr = itr.next;
            }
            System.out.println();
        }
    }
}
