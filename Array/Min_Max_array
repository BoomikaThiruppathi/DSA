import java.io.*;
import java.util.*;

public class Solution {
    public static int arraymax(int a[])
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }

public static int arraymin(int a[])
{
    int min=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<min)
        {
            min=a[i];
        }
    }
    return min;
}


    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        int max=arraymax(a);
        int min=arraymin(a);
        
        int span=max-min;
        System.out.println(span);
        
    }
}
