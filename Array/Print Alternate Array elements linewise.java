import java.io.*;
import java.util.*;

public class Solution {
public static void printarray(int a[])
{
    
        for(int i=0;i<a.length;i+=2)
        {
          System.out.println(a[i]);
        }
    
}
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
       printarray(a);
    }
}
