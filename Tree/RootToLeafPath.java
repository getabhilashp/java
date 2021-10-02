import java.util.*;

public class RootToLeafPath {
   public static void main(String args[])
   {
        Node root = null;
        Scanner sc = new Scanner(System.in);
      
        
         root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
         root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
         root.rightNode.leftNode.rightNode = newNode(21);
         root.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root.leftNode.rightNode.leftNode = newNode(2);
        int[] path = new int[20];
        int length =0;
         RootToLeafPathR(root , path , length);
   }
     public static Node newNode(int data) {
     Node node = new Node(data);
     return node;
   }
   public static void RootToLeafPathR(Node root,int[] path , int length)
   {
        if(root != null)
        {
            path[length] = root.data;
            length++;
            if( root.leftNode == null && root.rightNode == null)
            {
                printarrauy(path ,length);
            }
            else
            {
                RootToLeafPathR(root.leftNode, path , length);
                RootToLeafPathR(root.rightNode, path , length);
            }



        }


   }
   public static void printarrauy(int[] path,int length)
   {
      for( int i =0 ;i < length; i++)
      {
          if(i != length-1)
          System.out.print(path[i] + " - ");
          else
          System.out.print(path[i] + " \n ");


      }

   }

}
