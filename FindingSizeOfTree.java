
import java.util.*;


public class FindingSizeOfTree {


    public static void main(String args[]) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
          
            
             root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
             root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
             root.rightNode.leftNode.rightNode = newNode(21);
             root.rightNode.leftNode.rightNode.leftNode = newNode(22);
             root.leftNode.rightNode.leftNode = newNode(2);
    
             System.out.println(SizeOfBT(root));
             System.out.println(SizeOfBTII(root));

          //   System.out.println(find_maxII(root).data);
    
    
        
             
           
        
    }
        public static Node newNode(int data) {
            Node node = new Node(data);
            return node;
        }
    public static int SizeOfBT( Node root)
    {
       if(root == null)
       {
           return  0;
       }
       else{
           return (1 + SizeOfBT(root.leftNode) + SizeOfBT(root.rightNode));

       }

    } 
    
    public static int SizeOfBTII(Node root)
    {
    
       // Node Max = newNode(Integer.MIN_VALUE);
       int count = 0;

        if(root != null)
        {
            LinkedList<Node> que = new LinkedList<Node>();
            que.add(root);
            while( !que.isEmpty())
            {
                Node temp = que.pop();
                count++;
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
