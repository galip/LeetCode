package problems.easy;

// https://leetcode.com/problems/merge-two-binary-trees/
public class MergeTwoBinaryTrees {
	public static void main(String[] args) {
		
		// Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
		
		TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);
        
        // Create root2 manually (handle 'null' correctly)
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);
        
        TreeNode resultNode = mergeTrees(root1, root2);
        
        printTree(resultNode);		
	}
	
	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		
		if(root1 == null && root2 == null)
			return null;
		if(root1 == null)
			return root2;
		if(root2 == null)
			return root1;
        
		TreeNode resultNode = new TreeNode(root1.val + root2.val);
		resultNode.left = mergeTrees(root1.left, root2.left);
		resultNode.right = mergeTrees(root1.right, root2.right);
        
        return resultNode;
    }
	
	public static void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);  // Visit left child
            System.out.print(node.val + " ");  // Print node value
            printTree(node.right);  // Visit right child
        }
    }
}
