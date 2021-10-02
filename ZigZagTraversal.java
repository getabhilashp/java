// simple use pnly to stack 
// even to try using queue and stack


import java.util.*;
public class ZigZagTraversal {


    public static void main(String args[]) {
        Node root = null;
        Scanner sc = new Scanner(System.in);
          
            
             root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
             root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
             root.rightNode.leftNode.rightNode = newNode(21);
             root.rightNode.leftNode.rightNode.leftNode = newNode(22);
             root.leftNode.rightNode.leftNode = newNode(2);
            zigzag(root);
        //   System.out.println(find_maxII(root).data);   
        
    }
    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }    
    public static void zigzag( Node root)
    {
        Stack<Node> s1= new Stack<Node>();
        s1.push(root);
        Stack<Node> s2 = new Stack<Node>();
        Node left = null, right= null, temp= null;
        while(true)
        {
            while(!s1.isEmpty())
            {
                temp = s1.pop();
                System.out.print(temp.data);
                if(temp.leftNode != null)
                {
                    s2.push(temp.leftNode);
                }
                if(temp.rightNode != null)
                {
                    s2.push(temp.rightNode);
                }

            }    
            while(!s2.isEmpty())
            {
                temp = s2.pop();
                System.out.print(temp.data);
                if(temp.leftNode != null)
                {
                    s1.push(temp.leftNode);
                }
                if(temp.rightNode != null)
                {
                    s1.push(temp.rightNode);
                }

            }  
            if( s2.isEmpty() && s1.isEmpty())
            {
                break;
            }        
        }
    } 
}
