//Good problem from divide and conquer ---------------very important


package DivideandConquer;

public class StockPricingProblem {

    public static void main(String args[])
    {
       int[] array = { 100, 180, 260, 310, 40, 535, 695  };
       System.out.println(stock(array, 0, array.length-1));
       System.out.println(stock2(array));
    }
    public static int stock(int[] a , int l,int h)
    {
       int profit = 0;
       if( h <= l)
        return 0;

       for( int i =l ; i < h; i++)
       {
           for(int j =i+1; j <= h ; j++)
           {
            if (a[j] > a[i])
            {
                int curr_prof = a[j] - a[i]+ stock(a, j+ 1, h ) + stock(a, l, i-1);
                profit = Math.max(profit , curr_prof);
            }
           }
          
       }

       return profit;
    }
    public static int stock2(int[] a )
    {
        int start = a[0];
        int profit = 0;
        for(int i = 0 ; i < a.length-1;  i++)
        {
            if( a[i]  > a[i+1])
            {
                profit =  profit + a[i] -start;
                start = a[i+ 1];

            }

        }
        if( start  < a[a.length-1])
        {
            profit = profit + a[a.length-1] -start;
        }
        return profit;



    }
    
}


