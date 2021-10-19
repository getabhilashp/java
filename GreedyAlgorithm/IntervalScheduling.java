package GreedyAlgorithm;

public class IntervalScheduling {
    public static void main(String args[])
    {
        int[] start  =  {1, 3, 0, 5, 8, 5};
        int[] finish =  {2, 4, 6, 7, 9, 9};

        System.out.println(Intervalresolution(start,finish));



    }
    public static int Intervalresolution(int[] start, int[] finish)
    {
            for( int i = 0; i < start.length; i++ )
            {
                for(int j = 0; j < start.length-1; j++ )
                {
                    if( finish[j] >  finish[j+1] )
                    {
                        int temp = finish[j];

                        finish[j] = finish[j+1];
                        finish[j+1] = temp;

                         temp = start[j];
                         start[j] = start[j+1];
                         start[j+1] = temp;
                    }

                    
                }
            }
            int max= 0;
            for( int i =0 ; i < start.length; i++)
            {
               int  count = 0 ; 
                for( int j =i ; j < start.length; j++)
                {
                    if( start[i] < start[j])
                    {
                        count++ ;
                    }
                }
                if( max < count)
                {
                    max= count;
                }
            }
            return max;



    }
    
}
