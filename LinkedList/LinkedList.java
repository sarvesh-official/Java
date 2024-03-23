package LinkedList;

public class LinkedList {
    public class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int d) {

        // * creating new node 
        Node newNode = new Node(d);
        size++;
        if (head == null) {

            head = tail = newNode;
            return;
        }

        // * assigning next to the pervious head
        newNode.next = head;

        // * assigning head to the newNode
        head = newNode;

    }
    
    public void addLast(int d) {

        Node newNode = new Node(d);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    
    public void print() {

        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " " + "-> ");
            temp = temp.next;
        }
        System.out.println("nullptr");
    }
    
    public void add(int idx, int d) {

        if (idx == 0) {
            size++;
            addFirst(d);
            return;
        }
        Node newNode = new Node(d);
        Node temp = head;
        size++;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }
    
    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    
    public int removeLast() {

        if (size == 0) {

            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }
        Node prev = head;

        for (int i = 0; i < size - 2; i++) {

            prev = prev.next;
        }
        int val = prev.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key) {
        Node temp = head;

        int i = 0;

        while (temp != null) {

            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    public int helper(Node head, int key) {
        
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }    

    public int recSearch(int key) {
        return helper(head, key);
    }
    

    //! Delete nth node from the end
    public void deleteNthFromEnd(int pos) {
        
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (pos == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - pos;

        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
            
        }

        prev.next = prev.next.next;
        return;
    }
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(40);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(25);
        ll.addLast(53);
        ll.addLast(35);
        ll.addLast(51);

        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.itrSearch(53));
        System.out.println(ll.recSearch(53));
        // ll.reverse();
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();
       
    }
}


