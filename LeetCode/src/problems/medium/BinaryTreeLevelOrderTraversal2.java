package problems.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import problems.easy.TreeNode;

public class BinaryTreeLevelOrderTraversal2 {
	public static void main(String args[]) {
//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(9);
//		root.right = new TreeNode(20);
//		root.left.left = null;
//		root.left.right = null;
//		root.right.right = new TreeNode(7);
//		root.right.left = new TreeNode(15);

		TreeNode root = null;

		System.out.println(levelOrderBottom(root));
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<>();

		if (root == null)
			return list;

		Queue<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> tmp = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				TreeNode currentNode = queue.poll();
				tmp.add(currentNode.val);
				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}

				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
			// add always to first index.
			list.add(0, tmp);
		}
		return list;
	}

}
