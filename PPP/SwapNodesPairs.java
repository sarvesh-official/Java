package PPP;

public class SwapNodesPairs {
    public ListNode swapPairs(ListNode head) {

           ListNode dummy = new ListNode(0);
          dummy.next = head ; // dummy --> head --> ....all other elementes --> null

          ListNode curr = dummy ; // to start with dummy 

          // curr.next = head , curr.next.next == element after head
         
         while(curr.next != null && curr.next.next != null){

            ListNode first = curr.next; // first element value after dummy
            ListNode second = curr.next.next; // second element value after dummy

            first.next = second.next; // to break the first --> second chain && rechain with first --> third

            curr.next = second; // changing the head to the second element

            curr.next.next = first; // changing the second value to first element


            // Now moving the current pointer two nodes ahead
            curr = curr.next.next;


         }
        return dummy.next;
    }
}
