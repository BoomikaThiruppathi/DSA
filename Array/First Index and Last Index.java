import java.io.*;
import java.util.*;
public class solution{
    public static int firstOcc(int arr[],int n,int num){
        for(int i = 0;i < n;i ++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    
    public static int secondOcc(int arr[],int n,int num){
        for(int i = n-1; i >= 0;i --){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0;i < n;i ++){
            arr[i] = scn.nextInt();
        }
        
        int num = scn.nextInt();
        
        int firstIndex = firstOcc(arr,n,num);
        int secondIndex = secondOcc(arr,n,num);
        
        System.out.println(firstIndex);
        System.out.println(secondIndex);
    }
}
