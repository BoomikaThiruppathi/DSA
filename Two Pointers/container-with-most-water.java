import java.io.*;
import java.util.*;

public class Solution {
    public static int maxArea(int arr[],int n){
        int ans = Integer.MIN_VALUE,i = 0, j = n-1;
        while(i < j){
            int minHt = Math.min(arr[i],arr[j]);
            int tempArea = minHt * (j - 1);
            
            
            if(ans < tempArea){
                ans = tempArea;
            }
            
            if(arr[i] < arr[j]){
                i ++;
            }
            else
            {
                j --;
            }
         }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i ++){
            arr[i] = scn.nextInt();
        }
        System.out.println(maxArea(arr,n));
    }
}
