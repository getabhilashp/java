

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

        parentHight(int[] arr);


    }

}



