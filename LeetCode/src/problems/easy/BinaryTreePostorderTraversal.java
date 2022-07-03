package problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-postorder-traversal/
public class BinaryTreePostorderTraversal {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = null;
		root.right = new TreeNode(2);
		root.right.left= new TreeNode(3);
		
		System.out.println(postorderTraversal(root));
	}

	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null)
			return list;
		Stack<TreeNode> firstStack = new Stack<>();
		Stack<TreeNode> secondStack = new Stack<>();
		
		firstStack.push(root);
		TreeNode node;
		while(!firstStack.isEmpty()) {
			node = firstStack.pop();
			secondStack.push(node);
			
			if(node.left != null) {
				firstStack.push(node.left);
			}
			if(node.right != null) {
				firstStack.push(node.right);
			}
		}
		while(!secondStack.isEmpty()) {
			node = secondStack.pop();
			list.add(node.val);
		}
		return list;
	}
}