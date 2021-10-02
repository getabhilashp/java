// Deleting in binary tree, just find last node and replace with node found.
//Mirror nof binary tree 

import java.util.*;


public class MirrorTree {
    

public static void main(String args[]) {
    Node root = null;
    Node root1 = null;

    Scanner sc = new Scanner(System.in);
      
        
         root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
         root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
         root.rightNode.leftNode.rightNode = newNode(21);
         root.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root.leftNode.rightNode.leftNode = newNode(2);

         root1 = newNode(7); root1.leftNode = newNode(8); root1.rightNode = newNode(10);
         root1.leftNode.rightNode = newNode(6); root1.rightNode.leftNode = newNode(20);
         root1.rightNode.leftNode.rightNode = newNode(21);
         root1.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root1.leftNode.rightNode.leftNode = newNode(2);

         System.out.println(Mirror(root , root1));
      //  System.out.println(findII(root, 21));
    
}
    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
    public static boolean Mirror(Node root , Node root1)
    {
   
        if(root == null && root1 == null)
        return true;
        else 
        if(root == null || root1 == null)
        return false;       
        else{

            return ( root.data == root1.data && Mirror(root.leftNode, root1.leftNode) && Mirror(root.rightNode, root1.rightNode) );
        }            


    }



}

