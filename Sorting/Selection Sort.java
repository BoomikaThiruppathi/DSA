import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0;i < n-1;i ++){
            int min = i;
            for(int j = i+1;j < n;j ++){
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            
        }
        for(int i = 0;i < n;i ++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
