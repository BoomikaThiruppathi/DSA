import java.io.*;
import java.util.*;

public class Solution {
    public static void sum(int arr[],int n,int tar){
        int i =0,j = n-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == tar){
                System.out.print(arr[i]+" "+arr[j]);
                return;
            }
            else if(sum < tar){
                i ++;
            }
            else
            {
                j --;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i ++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        sum(arr,n,tar);
    }
}
