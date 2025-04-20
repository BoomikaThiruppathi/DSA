import java.io.*;
import java.util.*;

public class Solution {
    public static int sortByPivot(int arr[],int low,int high,int pivot){
        int i = low,j = low;
        while(i <= high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                i ++;
                j ++;
            }
            else
            {
                i ++;
            }
        }
        return j - 1;
    }
public static void quicksort(int arr[],int low,int high){
    if(low > high){
        return;
    }
    int pivot = arr[high];
    int pindex = sortByPivot(arr,low,high,pivot);
    quicksort(arr,low,pindex - 1);
    quicksort(arr,pindex + 1,high);
}
    public static void main(String[] args) {
             Scanner scn = new Scanner(System.in);
             int n = scn.nextInt();
             int arr[] = new int[n];
             for(int i = 0;i < n;i ++){
                 arr[i] = scn.nextInt();
             }
             quicksort(arr,0,n-1);
             for(int i = 0;i < n;i ++){
                 System.out.print(arr[i] + " ");
             }
    
    }
}
