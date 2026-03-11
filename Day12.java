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

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev=null;
//         ListNode curr=head;
//         while(curr!=null){
//             ListNode next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         return prev;
//     }
// }


// 2)Middle of the Linked List

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


// class Solution {
//     public ListNode middleNode(ListNode head) {
//          ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;
//     }
//     }

// 3)Linked List Cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         if(head==null)return false;
//         ListNode slow=head;
//         ListNode fast=head;
//         while(fast!=null&&fast.next!=null){
//         slow=slow.next;
//         fast=fast.next;
//         if(slow==fast)
//         return true;
//         }
//         return false;
//     }
// }