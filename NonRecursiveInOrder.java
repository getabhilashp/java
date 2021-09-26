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

public class NonRecursiveInOrder {
    public static void main(String args[])
    {
        Node root = null;
        Scanner sc =  new Scanner(System.in);
        while(true)
        {
            System.out.println("Hi Welcome to Binary Search Tree // DS \n 1.ADD \n 2.Non Recursive Inorder\n 3.exit");
            int n = sc.nextInt();
           if(n == 1 )
            {
                int data = sc.nextInt();
                root = add_node(root, data);
            }
            else if( n == 2)
            {
                retireval_inorder(root);
            }
            else{
                    return;
            }
      /*      
            root  =  newNode(7);
            root.leftNode = newNode(8);
            root.rightNode = newNode(10);
            root.leftNode.rightNode = newNode(4);
            root.rightNode.leftNode = newNode(20);
            root.rightNode.leftNode.rightNode = newNode(21);
            root.rightNode.leftNode.rightNode.leftNode = newNode(22);
            root.leftNode.rightNode.leftNode = newNode(2);
*/
           // retireval_preorder(root);
            //sc.close();
    }
    }
    public static Node add_node(Node head,int data)
    {
        if(head == null)
        {
                head = newNode(data);
        }
        else{
            Node temp = head;
            while(true)
            {
                if( temp.data > data)
                {
                    if(temp.leftNode == null )
                    {
                        temp.leftNode = newNode(data);
                        break;
                    }
                    temp = temp.leftNode;
                }
                else 
                {
                    if(temp.rightNode == null )
                    {
                       temp.rightNode = newNode(data);
                        break;
                    }
                    temp = temp.rightNode; // equal and as well as smaller
                }
              
            }
        }
        return head;

    }
    public static Node newNode(int data)
    {
        Node node =  new Node(data);
        return node;
    }
    public static void retireval_inorder(Node root)
    {
        if( root == null)
        {
            System.out.println("==================== Empty Tree ===================");
        }
        else{

            Stack<Node> s = new Stack<Node>();
            Node temp = root;
            while(true)
            {
                while(temp != null)
                {              
                  s.push(temp);
                    temp = temp.leftNode;

                }
                
                    if(s.isEmpty())
                    break;
                    temp = s.pop();
                    System.out.print(temp.data + " ");
                    temp = temp.rightNode;
                
        }
    }

    }
}

/*
      //     while(temp != null)
            //     {
            //       System.out.print(temp.data);
            //       s.push(temp);
            //       temp = temp.leftNode;
            //    //   System.out.print(" V ");

            //     }
            //     if(s.isEmpty())
            //     break;
            //     //temp = s.pop();
            //    // System.out.print(" V ");

            //     if(temp.rightNode != null)
            //     {
            //         temp = temp.rightNode;
            //     }
            //   //  System.out.print(" V ");
      
tree with multiple same element
    12
   /    \
10       20
/  \     /
9   11   12 
/      \
10       12
*/