/*1. Sort all lectures based on start time in ascending order.
2. Number of initial classrooms = 0
3. While lecture to be scheduled:
   3.1 Take first lecture yet not scheduled,
   3.2 If there a already a class available for lecture's start time
       Assign lecture to the class.
   3.3 If not, then allocate a new classroom
       number of classroom = number of classroom + 1
4. Return number of classrooms.

incomplete---------------
*/


package GreedyAlgorithm;

public class IntervalProblemType2 {

    public static void main(String args[])
    {


        int[] start  =  {1, 3, 0, 5, 8, 5};
        int[] finish =  {2, 4, 6, 7, 9, 9};

        System.out.println(no_of_room(start,finish));

    }
    public static int  no_of_room(int[] start,int[] finish)
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
        int classroom =0 ;




    }
    
}
