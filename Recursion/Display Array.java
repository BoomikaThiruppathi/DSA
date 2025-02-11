import java.io.*;
import java.util.*;

public class Solution {
    public static void displayArr(int arr[],int n,int index){
        if(index == n){
            return;
        }
        System.out.println(arr[index]);
        displayArr(arr,n,index + 1);
    }

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i ++){
            arr[i] = scn.nextInt();
        }
        displayArr(arr,n,0);
    }
}
