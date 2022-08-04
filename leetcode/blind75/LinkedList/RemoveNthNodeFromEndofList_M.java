package leetcode.blind75.LinkedList;

/*
 * Given the head of a linked list, remove the nth node from the end of the list and return its head.
Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
        return null;
    
        int nodeCount = 1;
        int count = 1;
        ListNode temp = head;
        ListNode temp1 = head;

        while(temp.next!=null){
            nodeCount++;
            temp = temp.next;
        }

        if(nodeCount==n){
            head=temp1.next;
            return head;
        }


        while(count < (nodeCount-n)){
            temp1 = temp1.next;
            count++;
        }

        temp1.next = temp1.next.next;

        return head;
        
    }
}
