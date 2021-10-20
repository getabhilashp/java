//giving logn solution is diificult but if array is given sorted then it means complexcity is less so always to reduce complexcity
// given array is not repeated.
// subtract every number with it's value u have to fin d now zero
package DivideandConquer;

public class findingA_I_equal_I {

    public static void main(String args[])
    {
        int[] array= { -10, 0 , 2 , 7 , 8 , 9 ,23};
        System.out.println(fun( array));
    }
    public static int fun(int[] array)
    {
        for( int i = 0 ; i < array.length; i++)
        {
            array[i] = array[i] - i;
        }
        return binarySearch(array, 0, array.length,0);

    }
     public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
}
