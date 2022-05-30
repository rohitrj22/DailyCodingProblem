// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

// Input: head = [1,2,3,4]
// Output: [2,1,4,3]
 


public class SwapNodesInPairs {
    public class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode solve(ListNode head,int count)
    {
         if(head==null)
            return head;
        ListNode node = solve(head.next,count+1);
        if(count%2==0)
        {
            ListNode res = head.next;
            if(res==null)
            {
                return head;
            }
        res.next=head;
        head.next=node;
        return res;
        }
        return node;
        
    }
    
    public ListNode swapPairs(ListNode head) {
        
        return solve(head,0);
        
    }
    
}
