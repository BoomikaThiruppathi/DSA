import java.io.*;
import java.util.*;

public class Solution {
  public static int[] mergetwoarray(int fh[],int sh[]){
      int i =0,j=0,k=0;
      int n = fh.length;
      int m = sh.length;
      
      
      int res[] = new int[n+m];
      while(i < n && j < m){
          if(fh[i] > sh[j]){
              res[k] = sh[j];
              j++;
          }
          else
          {
              res[k] = fh[i];
              i++;
          }
          k++;
      }
      while(i < n){
          res[k] = fh[i];
          i++;
          k++;
      }
      while(j < m){
          res[k] = sh[j];
          j++;
          k++;
      }
      return res;
  }
    
    public static int[] mergesort(int arr[],int low,int high){
        if(low == high){
            int base[] = new int[1];
            base[0] = arr[low];
            return base;
        }
        
        int mid = (low + high)/2;
        int fh[] = mergesort(arr,low,mid);
        int sh[] = mergesort(arr,mid+1,high);
        
        return mergetwoarray(fh,sh);
    }
    
    public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0;i < n;i ++){
            arr[i] = scn.nextInt();
        }
        arr = mergesort(arr,0,n-1);
           for(int i =0;i < n;i ++){
              System.out.print(arr[i] + " ");
           }
        
    }
}
