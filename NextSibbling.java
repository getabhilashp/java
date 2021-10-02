

// need to check done as it is super simple logic


import java.util.*;
class Node2{
    int data;
    Node2 leftNode;
    Node2 rightNode;
    Node2 nextSiblling;
    public Node2(int data)
    {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
        this.nextSiblling = null;
    }
}
public class NextSibbling {
    public static void main(String args[]) {
        Node2 root = null;
        Scanner sc = new Scanner(System.in);
          
            
             root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
             root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
             root.rightNode.leftNode.rightNode = newNode(21);
             root.rightNode.leftNode.rightNode.leftNode = newNode(22);
             root.leftNode.rightNode.leftNode = newNode(2);
            siblling(root);
        //   System.out.println(find_maxII(root).data);   
        
    }
    public static Node2 newNode(int data) {
        Node2 node = new Node2(data);
        return node;
    }    
    public static void siblling( Node2 root)
    {

        LinkedList<Node2> ll = new LinkedList<Node2>();
        ll.add(root);
        ll.add(null);
        while( true)
        {
            Node2 temp = ll.pop();
            if(temp == null)
            {
                if( ll.isEmpty())
                    break;
                ll.add(null);
                continue;

            }
            temp.nextSiblling = ll.peek();
            if( temp.leftNode != null)
            {
                ll.push(temp.leftNode);
            }
            if(temp.leftNode != null)
            {
                ll.push(temp.leftNode);
   
            }


        }
       
    } 
}

