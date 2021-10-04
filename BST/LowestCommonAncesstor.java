package BST;
import java.util.*;
/*class Node{
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
public class LowestCommonAncesstor {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      
        Node root = newNode(10);
        root.leftNode = newNode(6); root.rightNode = newNode(16);
         root.leftNode.rightNode = newNode(9); root.rightNode.leftNode = newNode(13);
        // root.rightNode.leftNode.rightNode = newNode(9);
        // root.rightNode.leftNode.rightNode.leftNode = newNode(22);
        // root.leftNode.rightNode.leftNode = newNode(2);
         System.out.println(LCA(root , 9 ,13).data);         
}
    
public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
public static Node LCA(Node root, int a, int b)
{
    while(true)
    {

        if((a < root.data && b > root.data) || ( a < root.data  && b > root.data))
          return root;
        if( a < root.data)
        {
            root = root.leftNode;
        }
        else
        {
            root = root.rightNode;
        }

    }
}

    
}
