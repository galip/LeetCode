package problems.easy;

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

// https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        // Manually linking the nodes to form the linked list
        head.next = node2; // node1 points to node2
        node2.next = node3; // node2 points to node3
        node3.next = node4; // node3 points to node4
        node4.next = node5; // node4 points to node5
        node5.next = null;
                
        reverseList(head);
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode resultNode = null;
		while(head != null) {
			ListNode tmp = head.next;
			head.next = resultNode;
			resultNode = head;
			head = tmp;
		}
		return resultNode;
    }
}
