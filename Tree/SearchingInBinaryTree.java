package Tree;
//search value in binary tree with recursion and without recursion
// return type and not equal to null important to check. and her right function in if else becouse 
// before developing solution think about which is easy recursive one or iterative one.

import java.util.*;

class SearchingInBinaryTree{
public static void main(String args[]) {
    Node root = null;
    Scanner sc = new Scanner(System.in);
      
        
         root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
         root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
         root.rightNode.leftNode.rightNode = newNode(21);
         root.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root.leftNode.rightNode.leftNode = newNode(2);

         System.out.println(find(root , 4));
        System.out.println(findII(root, 21));


    
         
       
    
}
    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
    public static boolean find(Node root , int data)
    {
   
        if(root != null)
        {
            boolean ans = false;
            if(root.data == data)
            {
                ans = true;
                return ans;
            }
          //  System.out.println(root.data);
             ans = find(root.leftNode,data);
            if(ans == true)
            return ans;
            else
            ans = find(root.rightNode, data);
            return ans;

        }
        return false;

    }


public static boolean findII(Node root, int data)
{

    //Node Max = newNode(Integer.MIN_VALUE);
   
    if(root != null)
    {
        LinkedList<Node> que = new LinkedList<Node>();
        que.add(root);
        while( !que.isEmpty())
        {
            Node temp = que.pop();
            if(temp.data == data)
            {
                return true;
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
return false;

}
}


//shortcut for indenting code
