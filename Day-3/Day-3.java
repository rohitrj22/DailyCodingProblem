// Good morning! Here's your coding interview problem for today.

// This problem was asked by Google.

// Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

// For example, given the following Node class

// class Node:
//     def __init__(self, val, left=None, right=None):
//         self.val = val
//         self.left = left
//         self.right = right
// The following test should pass:

// node = Node('root', Node('left', Node('left.left')), Node('right'))
// assert deserialize(serialize(node)).left.left.val == 'left.left'

import java.util.*;
import java.io.*;

class Node{
    String val;
    static String s="";
    Node left=null,right=null;
    static String [] serializedList ;
    static int i=0;
    // different constructors to match different cases
    Node(String val,Node left, Node right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }
    Node(String val,Node left)
    {
        this.val=val;
        this.left=left;
    }
    Node(String val)
    {
        this.val=val;

    }
    static void serialize(Node node)
    {
       if(node==null)
       {
        s=s+"null ";
        return;
       }
        
        s=s+node.val+" ";
        serialize(node.left);
        serialize(node.right);


        
    }
    static Node deserialize(String str[])
    { 
        //System.out.println(i + " " + str.length + " ");
        Node node = new Node("null",null,null); 
        if(i>=str.length || str[i].equals("null"))
            return node;
        node.val=str[i];
        i++;
        node.left=deserialize(str);
        i++;
        node.right=deserialize(str);
       // System.out.print(node.val + " " + node.left.val + " " +  node.right.val);
        //i++;

        return node;
    }
    public static void main(String args[])
    {

        Node node = new Node("root", new Node("left", new Node("left.left"),null), new Node("right",null,null));
       // System.out.println(serialize(node));
       serialize(node);
      // assert deserialize(s).left.left.val == "left.left";
     
        //printing serialized string
       System.out.println(s);
       //tokenizing serialized string
       serializedList = s.split(" ");
      // System.out.println(serializedList.length);
        Node node1 = new Node("null",null,null);
        node1 = deserialize(serializedList);
         System.out.println(node1.left.left.val); //prints "left.left" and assertion is true

        
    }
}