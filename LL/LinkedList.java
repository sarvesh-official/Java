package LL;

import java.util.Stack;

public class LinkedList {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public Node head;
    public Node tail;

    public int size;


    void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }
    
    void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;

        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    int size() {
        System.out.println(size);
        return size;
    }

    void print() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    void insert(int data, int index) {

        Node newNode = new Node(data);
        if (index == 0) {

            addFirst(data);
            size++;

            return;
        }

        int idx = 0;
        Node curr = head;
        // Own Implementation
        while (curr != null) {

            if (idx == index - 1) {

                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            idx++;
            curr = curr.next;
        }
        size++;

        // Optimized
        // int i = 0;
        // while (i < index - 1) {

        //     curr = curr.next;
        //     i++;
        // }

        // newNode.next = curr.next;
        // curr.next = newNode;

    }
    

    int removeFirst() {

        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        } else if (size == 1) {

            int val = head.data;
            size--;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }
    
    int removeLast() {

        if (size == 0) {
            System.out.println("LL is Empty");
            return -1;
        } else if (size == 1) {
            int val = tail.data;

            head = tail = null;
            size--;
            return val;

        }

        // prev = size - 2
        int val = tail.data;
        Node prev = head;
        for (int i = 0; i < size - 1; i++) {
            System.out.println(prev.data);
            prev = prev.next;

        }

        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    
    int search(int key) {

        Node temp = head;

        int index = 0;
        while (temp != null) {

            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    void reverse() {

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
    
    void deleteNthFromEnd(int n) {

        Node dummy = head;

        int sz = 0;
        while (dummy != null) {
            sz++;
            dummy = dummy.next;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        Node prev = head;

        int i = 1;
        while (i < sz - n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //  Slow - Fast Approach
    Node findMid(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;
        }

        return slow;
    }

    // Real Method
    public boolean checkPalindrome() {
        
        if (head == null || head.next == null) {
            return true;
        }

        //* Finding Mid */
        Node midNode = findMid(head);

        // ^ Reversing 
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        
        Node right = prev; //right half head
        Node left = head; //left half head

        while (right != null) {

            if (right.data != left.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        
        return true;


    }

    // Palindrome checking with stack method (chatGpt)
    public boolean isPalindrome(Node head) {

       if(head == null || head.next == null){

            return true;
       } 

        Node current = head; 

        Stack<Integer> stack = new Stack<>();

       while(current != null){

            stack.push(current.data);
            current = current.next;
       }

       current = head;

       while(current !=null){

            int topElement = stack.pop();

            if(current.data != topElement){

                return false;
            }
            current = current.next;
       }

       return true;
       
    }
    public static void main(String[] args) {
        
        LinkedList l1 = new LinkedList();

        l1.addFirst(0);
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);

        
        LinkedList l2 = new LinkedList();
        
        l2.addFirst(0);
        l2.addFirst(-1);
        l2.addFirst(-2);
        l2.addFirst(-3);
        l2.addFirst(-4);
        l2.addFirst(-5);
        
        
        l1.print();
        l1.insert(20, 2);
        l1.insert(30, 3);
        l1.print();
        l1.removeFirst();
        l1.removeLast();
        l1.removeLast();
        l1.print();
        System.out.println(l1.search(30));
        
        l2.reverse();
        l2.print();
        LinkedList l3 = new LinkedList();
        l3.addLast(1);
        l3.addLast(2);
        l3.addLast(1);
        System.out.println(l3.checkPalindrome());
    }
}