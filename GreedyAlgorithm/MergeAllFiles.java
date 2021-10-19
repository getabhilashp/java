// Given an array F with size n. Assume the array content F[i] indicates the length 
// of the ith file and we want to merge all these files into one single 
//optimal solution
package GreedyAlgorithm;
import java.io.*;
import java.util.*;
class MergeAllFiles{


    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int[]  files = { 10, 5, 100,50,20,15};
            System.out.println(FileMerge(files));

    }
    public static int  FileMerge(int[] files)
    {
        PriorityQueue<Integer> pq =  new PriorityQueue();
        for( int element : files)
        {
            pq.add(element);
        }
        int ans = 0;
        while( !pq.isEmpty())
        {
            pq.add(ans);
            ans = pq.remove() + pq.remove();
        }
        return ans;


    }
}