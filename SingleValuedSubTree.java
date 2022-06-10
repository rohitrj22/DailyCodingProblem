


public class SingleValuedSubTree {

    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
      }

    public int count=0;
    public boolean isUnivalTree(Node root) {
        
        if(root==null)
            return true;
        
        boolean b1 = isUnivalTree(root.left);
        boolean b2 = isUnivalTree(root.right);
        if(b1 && b2)
        {
           // count++;   
            if(root.left!=null && root.right!=null)
            {
                if((root.left.data == root.right.data) && (root.left.data==root.data))
                   { count++;return true;}
            }
            if(root.left==null && root.right==null)
                { count++;return true;}
            if(root.left==null && root.data==root.right.data)
               { count++;return true;}
            if(root.right==null && root.data==root.left.data)
               { count++;return true;}
            
            
        }
        return false;
        
    }
    public int singlevalued(Node root)
    {
        isUnivalTree(root);
        return count;
        
        
        //code here
    }
    
}
