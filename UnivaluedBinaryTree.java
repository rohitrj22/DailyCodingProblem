// A binary tree is uni-valued if every node in the tree has the same value.

// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
    

public class UnivaluedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isUnivalTree(TreeNode root) {
        
        if(root==null)
            return true;
        
        if(isUnivalTree(root.left) && isUnivalTree(root.right))
        {
            
            if(root.left!=null && root.right!=null)
            {
                if((root.left.val == root.right.val) && (root.left.val==root.val))
                    return true;
            }
            if(root.left==null && root.right==null)
                return true;
            if(root.left==null && root.val==root.right.val)
                return true;
            if(root.right==null && root.val==root.left.val)
                return true;
            
            
        }
        return false;
        
    }
    
}
