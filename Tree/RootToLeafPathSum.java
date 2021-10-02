import java.util.*;

public class RootToLeafPathSum {
   public static void main(String args[])
   {
        Node root = null;
        Scanner sc = new Scanner(System.in);
      
        
         root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
         root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
         root.rightNode.leftNode.rightNode = newNode(21);
         root.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root.leftNode.rightNode.leftNode = newNode(2);
      //  int[] path = new int[20];
        int Sum =0;
         System.out.println(RootToLeafPathR(root ,0 , 17));
   }
     public static Node newNode(int data) {
     Node node = new Node(data);
     return node;
   }
   public static boolean RootToLeafPathR(Node root, int sum ,int target)
   {
        if(root != null)
        {
            sum = sum + root.data;
            boolean ans = false;
            System.out.println(sum);

                if(sum == target)
                {
                    System.out.println(sum);
                    return true;
                }
                ans = RootToLeafPathR(root.leftNode,sum, target);
                if(ans == true)
                {
                    return true;
                }
                else
                {
                  return RootToLeafPathR(root.rightNode, sum ,target);
                }
            }



        
        return false;


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
