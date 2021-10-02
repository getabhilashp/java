//line no 60 is prone to error if u use size 
package Tree;
import java.util.*;
public class findingHeightOfTree {
    
    public static void main(String args[]) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
          
            
             root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
             root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
             root.rightNode.leftNode.rightNode = newNode(21);
             root.rightNode.leftNode.rightNode.leftNode = newNode(22);
             root.leftNode.rightNode.leftNode = newNode(2);
    
             System.out.println(HieghtOfBT(root));
             System.out.println(HieghtOfBTII(root));

          //   System.out.println(find_maxII(root).data);     
        
    }
    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
public static int HieghtOfBT( Node root)
{
    int left = 0, right =0;
   if(root == null)
   {
       return  0;
   }
   else{
       left = HieghtOfBT(root.leftNode);
       right = HieghtOfBT(root.rightNode);

        return ( 1 + (left > right ? left:right));
      // return (1 + SizeOfBT(root.leftNode) + SizeOfBT(root.rightNode));

   }
}
   public static int HieghtOfBTII( Node root)
{
    int left = 0, right =0;
   if(root == null)
   {
       return  0;
   }
   else{
    LinkedList<Node> que = new LinkedList<Node>();
    que.add(root);
    que.add(null);
    int count =0 ;
    while( !que.isEmpty())
    {
        Node temp = que.pop();
        if(temp == null )
        {
            count++;
            if( !que.isEmpty())
                que.add(null);

        }
        else
{
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
        return count;
   }

} 







}
