package NeetCode;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class ReverseLinkedList {
   public static ListNode reverseLinkedList(ListNode head){
       ListNode cur = head;
       ListNode prev = null;

       while(cur!= null){
           ListNode next = cur.next;
           cur.next = prev;
           prev = cur;
           cur = next;
       }

       return prev;
   }
}
