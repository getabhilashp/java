//Given a parent arrray P, where P[i] indicates the parent of ith node in the tree
// O(n*n) solution
// if we carefully observe we just need to start at every node and keep going to its parent node untillwe reach -1

package GenericTree;
import java.util.*;
public class ParentArrayTypeQues {
    public static void main( String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        int l = sc.nextInt();
        System.out.println(" Enter Arrray of integer:");
        int[] array = new int[l];
        for(int i = 0 ; i <  l ;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println(parentHight(array));



    }

    public static int parentHight(int[] arr) 
    {
        int maxDepth = -1, CurrentDepth =-1, j;
        for( int i =0 ; i < arr.length; i++)
        {
            CurrentDepth = 0; j =i;
            while( arr[j] != -1)
            {
                CurrentDepth++ ;
                j = arr[j];
            }
            if(CurrentDepth > maxDepth)
            {
                maxDepth = CurrentDepth;
            }
        }
        return maxDepth;
    }

}



