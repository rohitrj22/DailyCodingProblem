public class CheckForBST {
    public class Node {
        int data;
        Node left;
        Node right;
        Node() {}
        Node(int data) { this.data = data; }
        Node(int data, Node left, Node right) {
           this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    boolean isBST(Node root)
    {
        // code here.
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean isBST(Node root,long min,long max)
    {
        if(root==null)
            return true;
        if(root.data<=min || root.data>=max)
            return false;
        return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
    }
    
}
