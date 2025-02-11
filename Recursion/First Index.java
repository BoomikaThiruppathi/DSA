import java.io.*;
import java.util.*;

public class Solution {
    public static int firstIDX(int arr[],int n,int x,int idx){
        if(idx == n){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }
        else
        {
            return firstIDX(arr,n,x,idx+1);
        }
    }

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i ++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(firstIDX(arr,n,x,0));
    }
}
