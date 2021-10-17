//coin change problem.................first by recursion(could have done by stack)
// try one time with DFS


package DynamicProgramming;
import java.io.*;
import java.util.*;
class MinCoinProblem{

    public static void main(String args[])
    {
        int[] coin = {1, 3, 5, 9, 11};

        fun_coin( 28, coin, 0) ;
        System.out.println(ans);
        System.out.println(        dfs_coin(28, coin));
        System.out.println(       " "+(dp_coin(28, coin) -1));


    }
    public static int ans= Integer.MAX_VALUE;
    public static void fun_coin(int n , int[] coin , int count)
    {
        if(n <= 0)
        {
            if( n == 0 && ans>  count)
            {
                ans = count;

            }
            return;
        }
        else
        {
            count = count + 1;
            for( int i =0 ; i < coin.length ;i++)
            {

            fun_coin(n-coin[i], coin, count);
            }

        }
        return;

    }

    public static int dfs_coin(int n , int[] coin)
    {
        LinkedList<Integer> qt = new LinkedList<Integer>();
        qt.add(n);
        qt.add(null);
        int count =0 ;
        while( !qt.isEmpty())
        {
            if(qt.peek() == null)
            {
                qt.remove();
                count++ ;
                if( qt.isEmpty())
                {
                    break;
                }
                qt.add(null);
                
            }
            int temp = qt.remove();
            for( int i =0 ; i < coin.length ; i++)
            {
                if( temp - coin[i] >= 0)
                {
                    qt.add(temp - coin[i]);
                }
            }
            if( temp == 0)
            {
                break;
            }

        }
        return count;


    }
    public static int dp_coin(int n ,int[] coin)
    {
        int count =0;
        Arrays.sort(coin);
        int j=coin.length-1;
        while(n>-1 && j>-1){
            if(n>coin[j]){
                n-=coin[j];
                count++;
            }
            else{
                j--;
            }
        }


        return count;
    }

}


