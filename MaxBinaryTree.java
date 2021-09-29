//max value in binary tree with recursion and without recursion

import java.util.*;

import javax.lang.model.util.ElementScanner6;
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
         System.out.println(find_maxII(root).data);


    
         
       
    
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

public static Node find_maxII(Node root)
{

    Node Max = newNode(Integer.MIN_VALUE);
   
    if(root != null)
    {
        LinkedList<Node> que = new LinkedList<Node>();
        que.add(root);
        while( !que.isEmpty())
        {
            Node temp = que.pop();
            if(temp.data > Max.data)
            {
                Max = temp;
            }
            if( temp.leftNode != null)
            {
                que.add(temp.leftNode);
            }
            if( temp.rightNode != null)
            {
                que.add(temp.rightNode);
            }

           
        }
       
    }
return Max;

}
}


//shortcut for indenting code
