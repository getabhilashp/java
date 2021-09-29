//max value in binary tree

import java.util.*;
class MaxBinaryTree{
public static void main(String args[]) {
    Node root = null;
    Scanner sc = new Scanner(System.in);
      
        
         root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
         root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
         root.rightNode.leftNode.rightNode = newNode(21);
         root.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root.leftNode.rightNode.leftNode = newNode(2);

         System.out.println(find_max(root).data);

    
         
       
    
}
    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
    public static Node find_max(Node root)
    {
        Node  left =null;
        Node right = null;
        Node Max = newNode(Integer.MIN_VALUE);
        if(root != null)
        {
            left = find_max(root.leftNode);
            right = find_max(root.rightNode);
            if( left != null && right != null)
            {
                if(left.data > right.data)
                {
                   
                       Max = left;
                }
                else
                {
                       Max = right;

                }
                if( root.data > Max.data)
                {
                    Max = root;
                }
            }
    }
    return Max;

}
}


//shortcut for indenting code
