package problems.easy;

// https://leetcode.com/problems/evaluate-boolean-binary-tree/
public class BinaryBooleanTree {
	public static void main(String args[]) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left.left = null;
		root.left.right = null;
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(1);

		System.out.println(evaluateTree(root));

	}

	public static boolean evaluateTree(TreeNode root) {
		if (root.left == null && root.right == null)
			return root.val == 0 ? false : true;
		boolean right, left;
		left = evaluateTree(root.left);
		right = evaluateTree(root.right);
		if (root.val == 2)
			return left | right;
		return left && right;
	}

}