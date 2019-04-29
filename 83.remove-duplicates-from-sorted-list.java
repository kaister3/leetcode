/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode pointer = head;
        ListNode pin = new ListNode(head.val);
        ListNode res = pin;
        int curVal = head.val;
        while(pointer != null) {
            if(curVal != pointer.val) {
                curVal = pointer.val;
                pin.next = new ListNode(pointer.val);
                pin = pin.next;
            }
            pointer = pointer.next;
        }
        return res;
    }
}

