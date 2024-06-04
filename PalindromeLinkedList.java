package NeetCode;

public class PalindromeLinkedList {
    public boolean palindromeLinkedList(ListNode head){
        // find middle element using hare and tortoise algorithm
        // reverse the last half linkedList using 3 pointers
        // check same element from both ways

        // hare and tortoise algorithm
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // slow is the middle element

        // reverse the other half
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }


        // check for the palindrome
        ListNode left = head;
        ListNode right = prev;

        while(right != null){
            if(left.val != right.val){
                return false;
            }
        }

        return true;
    }
}
