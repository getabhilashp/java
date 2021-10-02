package Tree;
import java.util.*;

public class MaximumSum {
   public static void main(String args[])
   {
        Node root = null;
        Scanner sc = new Scanner(System.in);
      
        
         root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
         root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
         root.rightNode.leftNode.rightNode = newNode(21);
         root.rightNode.leftNode.rightNode.leftNode = newNode(22);
         root.leftNode.rightNode.leftNode = newNode(2);

         System.out.println(MaxSum(root));
   }
     public static Node newNode(int data) {
     Node node = new Node(data);
     return node;
   }
   public static String MaxSum(Node root)
   {
       int mAXsUM =0 , sum =0, count =0;
    if(root != null)
    {
        LinkedList<Node> que = new LinkedList<Node>();
        que.add(root);
        que.add(null);
        while( !que.isEmpty())
        {
            Node temp = que.pop();
            if( temp == null)
            {
                if(mAXsUM < sum)
                {
                    mAXsUM = sum;
                }
                sum = 0;
                count++;
                if(que.isEmpty())
                {
                    break;
                }
                que.add(null);
                continue;

            }
            else
            {
                sum  = sum + temp.data;
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
    return count + "-" + mAXsUM;

}

}




