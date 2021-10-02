  //line no 60 is prone to error if u use size 
  package Tree;
  import java.util.*;

  class Node1 {
    int data;
    Node1 leftNode;
    Node1 rightNode;
    int ld;
    int rd;

    public Node1(int data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
        this.ld = 0;
        this.rd = 0;
    }
}
public class DiameterOfTree {

  
    
    public static void main(String args[]) {
        Node1 root = null;
        Scanner sc = new Scanner(System.in);
          
            
             root = newNode(7); root.leftNode = newNode(8); root.rightNode = newNode(10);
             root.leftNode.rightNode = newNode(4); root.rightNode.leftNode = newNode(20);
             root.rightNode.leftNode.rightNode = newNode(21);
             root.rightNode.leftNode.rightNode.leftNode = newNode(22);
             root.leftNode.rightNode.leftNode = newNode(2);
    
             System.out.println(DaimeterOfBT(root));
            // System.out.println(HieghtOfBTII(root));
                  //   System.out.println(find_maxII(root).data);     
        
    }
public static Node1 newNode(int data) {
        Node1 node = new Node1(data);
        return node;
    }
public static int DaimeterOfBT( Node1 root)
{
    int left = 0, right =0;
    int lDaimeter = 0, rDaimeter = 0;
   if(root == null)
   {
       return  0;
   }
   else{
       left = HieghtOfBT(root.leftNode);
       right = HieghtOfBT(root.rightNode);
        lDaimeter = DaimeterOfBT(root.leftNode);
        rDaimeter = DaimeterOfBT(root.rightNode);
        return Math.max( 1+ left + right , Math.max(lDaimeter,rDaimeter));
      // return (1 + SizeOfBT(root.leftNode) + SizeOfBT(root.rightNode));

   }
}
public static int HieghtOfBT( Node1 root)
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

}

    

