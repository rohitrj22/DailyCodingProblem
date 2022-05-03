// Good morning! Here's your coding interview problem for today.

// This problem was asked by Microsoft.

// Suppose an arithmetic expression is given as a binary tree. Each leaf is an integer and each internal node is one of '+', '−', '∗', or '/'.

// Given the root to such a tree, write a function to evaluate it.

// For example, given the following tree:


class Node
{
    String data;
    Node left,right;

    Node(String data)
     {
     this.data = data;
     this.left = null;
     this.right = null;
     }

}

public class ExpressionTree {

    int calc(int a,int b, String opr)
    {
        int x=a;
        int y=b;
        int res=0;
        switch(opr)
        {
            case "+":
                res= x+y;
                break;
            case "-":
                res= x-y;
                break;
            case "*":
                res= x*y;
                break;
            case "/":
                res= x/y;
                break;
        }
        return res;
    }
    public int evalTree(Node root) {
        // YouStrinr code here.evalroot.
        if(root.left==null && root.right==null)
            return Integer.parseInt(root.data);
        return calc(evalTree(root.left),evalTree(root.right),root.data);
    }
    
}
