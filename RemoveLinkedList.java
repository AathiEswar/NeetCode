package NeetCode;

public class RemoveLinkedList {

    public ListNode removeLinkedListRecursion (ListNode head , int val){
        if(head == null) return null;

        head.next = removeLinkedListRecursion(head.next , val);

        return head.val ==  val ? head.next : head;
    }
    public ListNode removeLinkedList(ListNode head, int val){
        // set a dummy pointer in the start and using normal two pointers

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Two pointers
        ListNode cur = head;
        ListNode prev = dummy;

        // Remove algo
        while(cur != null){
            if(cur.val == val){
                cur = cur.next ;
                prev.next  = cur;
            }
            else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        return dummy.next;
    }
}
