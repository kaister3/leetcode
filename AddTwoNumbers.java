//Definition for singly-linked list.
/*
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        //哑结点用来简化代码
        ListNode p = l1;
        ListNode q = l2;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            /*若节点存在即为该值*/
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}