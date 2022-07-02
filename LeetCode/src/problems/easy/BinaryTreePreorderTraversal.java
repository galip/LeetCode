package problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-preorder-traversal/
public class BinaryTreePreorderTraversal {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right= new TreeNode(2);
		
		preorderTraversal(root);
	}

	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.empty()) {
			
			TreeNode node = stack.peek();
			list.add(node.val);
			stack.pop();
			
			if(node.right != null)
				stack.push(node.right);
			
			if(node.left != null)
				stack.push(node.left);
			
		}
		return list;
	}
}