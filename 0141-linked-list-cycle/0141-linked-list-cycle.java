// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//         val = x;
//         next = null;
//     }
// }

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if (head == null || head.next == null) {
            return false;
        }
        System.out.println("1 head = " + head);
        ListNode slow = head;
        System.out.println("1 slow = " + slow);
        ListNode fast = head.next;
        System.out.println("1 fast = " + fast);
        
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            System.out.println("2 slow = " + slow);
            System.out.println("2 fast = " + fast);
        }
        return true;
        
        
        
        
        
        
        
        
//         if (head == null || head.next == null) {
//             return false;
//         }
        
//         ListNode slow = head;
//         ListNode fast = head.next;
        
//         while (slow != fast) {
//             if (fast == null || fast.next == null) {
//                 return false;
//             }
//             slow = slow.next;
//             fast = fast.next.next;   
//         }
//         return true;
    }
}