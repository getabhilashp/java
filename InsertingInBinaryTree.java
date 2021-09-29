//max value in binary tree with recursion and without recursion

import java.util.*;

class InsertingInBinaryTree{
public static void main(String args[]) {
    Node root = null;
    Scanner sc = new Scanner(System.in);
      
        
         root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
         root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
         root.rightNode.leftNode.rightNode = newNode(21);
         root.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root.leftNode.rightNode.leftNode = newNode(2);

         System.out.println(Insert(root, 4));
      //   System.out.println(find_maxII(root).data);


    
         
       
    
}
    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
   

public static boolean Insert(Node root, int data)
{

   // Node Max = newNode(Integer.MIN_VALUE);
   
    if(root != null)
    {
        LinkedList<Node> que = new LinkedList<Node>();
        que.add(root);
        while( !que.isEmpty())
        {
            Node temp = que.pop();
           
            if( temp.leftNode != null)
            {
                que.push(temp.leftNode);
            }
            else
            {
                temp.rightNode = newNode(data);
                return true;

            }
            if( temp.rightNode != null)
            {
                que.push(temp.rightNode);
            }
            else
            {
                temp.rightNode = newNode(data);
                return true;
            }

           
        }
       
    }
return false;

}
}


//shortcut for indenting code
