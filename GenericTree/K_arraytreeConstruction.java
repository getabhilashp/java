///k- array tree is a tree where each node has either 0 or k children. Given an array which contains preorder traversal


package GenericTree;

import java.util.Scanner;


class Node{
    char data;
    Node[] child;
    public Node(char data, int k)
    {
        this.data = data;
        child = new Node[k];
    }
}

public class K_arraytreeConstruction {
   
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Preorder traversal of K array : length");
    int l = sc.nextInt();
    System.out.println("Preorder traversal of K array :: ");
    char[] array = new char[l];
    for( int i =0 ; i < l;i++ )
    {  
        array[i] = sc.next().charAt(0);
    }
    k_array(array, array.length, 3);

}
public static int i = 0;
public static Node k_array(char[] array, int n,int k)
{
    if( n <= 0 )
    {
        return  null;
    }
    Node beer = new Node(array[i],k);
    for( int j =0 ; j < k ; j++)
    {
        if( k * i + j < n)
        {
            i++;
            beer.child[j] = k_array(array, n, k);
        }
        else{
            beer.child[j] = null;
        }
    }
    return beer;


}

    
}
