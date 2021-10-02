package Tree;
//interesting question to learn ,

import java.util.*;


public class PrintAncesstorOfTree {

    public static void main(String args[]) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
          
            
             root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
             root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
             root.rightNode.leftNode.rightNode = newNode(21);
             root.rightNode.leftNode.rightNode.leftNode = newNode(22);
             root.leftNode.rightNode.leftNode = newNode(2);
    
             //System.out.println(HieghtOfBT(root));
             //System.out.println(HieghtOfBTII(root));
             PrintAncesstors(root, 20);
          //   System.out.println(find_maxII(root).data);     
        
    }
    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }

    public static boolean PrintAncesstors(Node root, int data )
    {

        if( root == null)
            return false;
        if(root.data == data)
        {
            return true;
         }
        if( PrintAncesstors(root.leftNode, data) || PrintAncesstors(root.rightNode, data) )
        {
            System.out.println(root.data);
            return true;
        }

    
        return false ;

    }
    
}
