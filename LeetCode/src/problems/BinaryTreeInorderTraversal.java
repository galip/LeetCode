package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	public static void main(String args[]) {
//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(1);
//		root.right= new TreeNode(2);

		TreeNode root = new TreeNode(1);
		root.left = null;
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		
		System.out.println(inorderTraversal(root));
			
	}

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode currentNode = root;

		while (currentNode != null || stack.size() > 0) {
			while (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			list.add(currentNode.val);
			currentNode = currentNode.right;
		}
		return list;
	}
}