import java.io.*;
import java.util.*;

public class Solution {
    public static void sort(int arr[],int n){
        int i=0,j=0;
        while(i<n){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        for(i = 0;i < n;i ++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
    

         Scanner scn = new Scanner(System.in);
             int n = scn.nextInt();
             int arr[] = new int[n];
             for(int i = 0;i < n;i ++){
                 arr[i] = scn.nextInt();
             }
            sort(arr,n);
        
        
    }
}
