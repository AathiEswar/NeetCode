package NeetCode;

public class IntersectionOflinkedList {
    public ListNode intersection(ListNode head1 , ListNode head2){
        // base case
        if(head1 == null || head2 == null) return null;

        // two pointers
        ListNode cur1 = head1;
        ListNode cur2 = head2;

        // while both cur doesnt meet
        while(cur1 != cur2){

            // if one of them reach end it must start from the other list head;
            cur1 = (cur1 == null)? head2:cur1.next;
            cur2 = (cur2 == null)? head1:cur2.next;
        }

        // return the intersection node
        return cur1;
    }
}
