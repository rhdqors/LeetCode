/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;
        
        System.out.println("dummyHead data = " + dummyHead.val);
        System.out.println("dummyHead 주소값 = " + dummyHead);
        System.out.println("tail 주소값 = " + tail);
        
        while (l1 != null || l2 != null || carry != 0) {
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + carry;
            int val = sum % 10;
            carry = sum / 10;
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            System.out.println("sum = " + sum);
            
            ListNode newNode = new ListNode(val);
            tail.next = newNode;
            tail = tail.next;
            
            System.out.println("newNode = " + newNode);
            System.out.println("newNode.val = " + newNode.val);
            System.out.println("1 tail 주소값 = " + tail);
            System.out.println("tail.next 주소값 = " + tail.next);
            
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        
        ListNode result = dummyHead.next;
        return result;
    }
}