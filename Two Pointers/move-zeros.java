import java.io.*;
import java.util.*;

public class Solution {
    public static void sort(int arr[],int n){
      int i = 0;
        for(int j =0;j < n;j ++){
            if(arr[j] != 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
            }
        }
        for(i = 0;i < n;i ++){
            System.out.print(arr[i]+" ");
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
