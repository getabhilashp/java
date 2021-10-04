package BST;
import java.util.*;

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
}
 class FindingElementInBst {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      
        Node root = newNode(10);
        root.leftNode = newNode(6); root.rightNode = newNode(16);
         root.leftNode.rightNode = newNode(9); root.rightNode.leftNode = newNode(13);
         root.rightNode.leftNode.rightNode = newNode(9);
        // root.rightNode.leftNode.rightNode.leftNode = newNode(22);
        // root.leftNode.rightNode.leftNode = newNode(2);

         System.out.println(find(root , 6));


    
         
}
    

    public static Node newNode(int data) {
        Node node = new Node(data);
        return node;
    }
    public static boolean find(Node root , int data)
    {

        if(root != null)
        {
            boolean ans = false;
            if(root.data == data)
            {
                ans = true;
              //  System.out.println(ans);
                return ans;
            }
           // System.out.println(root.data);
          //  System.out.println(root.data);
           if(root.data > data && root.leftNode != null )
           {
              return find(root.leftNode,  data);
           }
           else if(root.data < data && root.rightNode != null  )
           {
                return find(root.rightNode, data);
           }
           else{
                return false;
           }

        }
        return false;

    }

}
