package problems.easy;

// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
	public static void main(String args[]) {
		hasCycle(null);
	}
	
	public static boolean hasCycle(ListNode head) {
		if(head == null || head.next == null)
			return false;
		
		ListNode slowNode = head;
		ListNode fastNode = head.next;
		
		while(fastNode != slowNode) {
			if(fastNode == null || fastNode.next == null)
				return false;
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		return true;
    }
	
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) {
	        val = x;
	        next = null;
	    }
	}
}