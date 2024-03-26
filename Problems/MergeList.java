package Problems;

import java.util.Scanner;

public class MergeList {

     public static void main(String[] args) {
        
             MergeList l1 = new MergeList() ; 
             MergeList l2 = new MergeList();

             Scanner sc = new Scanner(System.in);

             int n1 = sc.nextInt();

             for (int i = 0; i < n1; i++) {
                 l1.addLast(sc.nextInt());
             }
             
             int n2 = sc.nextInt();

             for (int i = 0; i < n2; i++) {
                 l2.addLast(sc.nextInt());
             }
             
             MergeSortIt(l1.head, l2.head, n1 + n2);

    }
    
    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }

    }

    public Node head;
    public Node tail;
    public int size;
    
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

    public static void MergeSortIt(Node l1, Node l2, int n) {

        MergeList result = new MergeList();


        int i = 0;
        
        while (i <= n) {

            if (l1 != null && l1.data <= l2.data) {
                result.addLast(l1.data);
                l1 = l1.next;
            } else if (l2 != null && l2.data < l1.data) {
                result.addLast(l2.data);
                l2 = l2.next;
            }
            i++;
        }
        
        result.print();

    }
    
    public static void printLinkedList(Node head) {
    if (head == null) {
        System.out.println("Linked List is Empty");
        return;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("nullptr");
}
   
}


