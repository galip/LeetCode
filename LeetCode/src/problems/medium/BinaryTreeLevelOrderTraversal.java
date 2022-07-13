package problems.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import problems.easy.TreeNode;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrderTraversal {
	public static void main(String args[]) {
//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(9);
//		root.right = new TreeNode(20);
//		root.left.left = null;
//		root.left.right = null;
//		root.right.right = new TreeNode(7);
//		root.right.left = new TreeNode(15);

//		TreeNode root = new TreeNode(1);
//		TreeNode root = null;

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.println(levelOrder(root));
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new LinkedList<>();

		if (root == null)
			return list;

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);

		TreeNode currentNode = null;

		List<Integer> tmp = new ArrayList<>();
		while (!queue.isEmpty()) {
			int size = queue.size();

			tmp = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				currentNode = queue.poll();
				tmp.add(currentNode.val);

				if (currentNode.left != null) {
					queue.add(currentNode.left);

				}

				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			// level changes.
			list.add(tmp);
		}
		return list;
	}

}
