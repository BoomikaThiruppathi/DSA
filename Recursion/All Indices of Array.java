import java.io.*;
import java.util.*;

public class Solution {
    public static int[] allIndices(int arr[],int n,int k,int count,int index){
        if(index == n){
            return new int[count];
        }
        if(arr[index] == k){
            int result[] = allIndices(arr,n,k,count + 1,index + 1);
            result[count] = index;
            return result;
        }
        else
        {
            return allIndices(arr,n,k,count,index + 1);
        }
    }
    
public static void main(String[] args){
   Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i < n;i ++){
        arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
     int indices[] = allIndices(arr,n,k,0,0);
     for(int i : indices){
         System.out.println(i);
     }
    
    }
}
