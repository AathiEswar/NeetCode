package NeetCode;

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
