// Good morning! Here's your coding interview problem for today.

// This problem was asked by Google.

// Determine whether a doubly linked list is a palindrome. What if it’s singly linked?

// For example, 1 -> 4 -> 3 -> 4 -> 1 returns True while 1 -> 4 returns False.






//  Definition for singly-linked list.
//   public class ListNode {
//       int val;
//       ListNode next;
//       ListNode() {}
//       ListNode(int val) { this.val = val; }
//       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//   }
 





public class PalindromeLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode node = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return node;
        
        
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slowPtr=head;
        if(slowPtr.next==null)
            return true;
        ListNode fastPtr = head.next.next;
        while(fastPtr!=null && fastPtr.next!=null)
        {
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
        }
        ListNode mid = reverse(slowPtr.next);
        while(mid!=null)
        {
            if(mid.val!=head.val)
                return false;
            mid=mid.next;
            head=head.next;
        }
        return true;
        
    }
    
}
