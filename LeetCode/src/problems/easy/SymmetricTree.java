package problems.easy;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// https://leetcode.com/problems/symmetric-tree/description/
public class SymmetricTree {
	public static void main(String[] args) {
		
		// Sample Input: root = [1,2,2,3,4,4,3]
		
		// creating each TreeNode
        TreeNode root = new TreeNode(1);
        
        TreeNode node2a = new TreeNode(2);
        TreeNode node2b = new TreeNode(2);
        
        TreeNode node3a = new TreeNode(3);
        TreeNode node4a = new TreeNode(4);
        TreeNode node4b = new TreeNode(4);
        TreeNode node3b = new TreeNode(3);
        
        // linking the nodes to form the tree
        root.left = node2a;  // Left child of root is 2
        root.right = node2b; // Right child of root is 2
        
        node2a.left = node3a; // Left child of node2a is 3
        node2a.right = node4a; // Right child of node2a is 4
        
        node2b.left = node4b;  // Left child of node2b is 4
        node2b.right = node3b; // Right child of node2b is 3
        
        System.out.println(isSymmetric(root));		
		
	}
	
    public static boolean isSymmetric(TreeNode root) {
    	
    	if(root == null)
    		return true;
    	
    	return recursiveSymmetric(root.left, root.right);
    }
    
    public static boolean recursiveSymmetric(TreeNode left, TreeNode right) {
    	if(left == null && right == null)
    		return true;
    	
    	if(left == null || right == null || left.val != right.val)
    		return false;
    	
    	return recursiveSymmetric(left.left, right.right) && recursiveSymmetric(left.right, right.left);
    }
}

