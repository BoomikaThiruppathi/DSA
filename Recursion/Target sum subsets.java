import java.io.*;
import java.util.*;

public class Solution {
    public static void tss(int arr[],int index,int sof,int target,String ans){
        if(sof > target){
            return;
        }
        if(index == arr.length){
            if(target == sof){
                System.out.println(ans + ".");
            }
            return;
        }
        tss(arr, index + 1,sof + arr[index], target, ans + arr[index] + ", ");
        tss(arr, index + 1,sof, target, ans);
    }

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i ++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        tss(arr,0,0,target,"");
    }
}
