//one of the important 
// find largest in left
// or if onel child.
package BST;
import java.util.*;
/*
class Node{
    int data;
    Node leftNode;
    Node rightNode;
    public Node(int data)
    {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
}*/
 class DeletingElementInBST {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      
        Node root = newNode(10);
        root.leftNode = newNode(6); root.rightNode = newNode(16);
         root.leftNode.rightNode = newNode(9); root.rightNode.leftNode = newNode(13);
         root.rightNode.leftNode.rightNode = newNode(9);
        // root.rightNode.leftNode.rightNode.leftNode = newNode(22);
        // root.leftNode.rightNode.leftNode = newNode(2);

         System.out.println(Delete(root , 6));


    
         
}
    

    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
    public static Node Delete(Node root , int data)
    {

        if(root != null)
        {
            if( data  < root.data)
             root.leftNode = Delete(root.leftNode , data);
            else if(data > root.data)
            {
              root.rightNode = Delete(root.rightNode, data);
            }
            else
            {
                Node temp = null;
                if( root.leftNode != null && root.rightNode != null)
                {
                    temp = FindMax(root.leftNode);
                    root.data = temp.data;
                    root.leftNode = Delete(root.leftNode, data);
                }
                else{
                    temp = root; 
                    if( root.leftNode == null)
                    {
                        root = root.rightNode;
                    }
                    if( root.rightNode == null)
                    {
                        root= root.leftNode;
                    }
                }




            }
        }
        return root;


    }
public static Node FindMax( Node root)
{
    int left = 0, right =0;
   if(root == null)
   {
       return  null;
   }
   if(root.rightNode == null )
    {
              return root;
    }
    else
        return FindMax(root);
      // return (1 + SizeOfBT(root.leftNode) + SizeOfBT(root.rightNode));

   }
}



