import java.util.Scanner;
public class Main{
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0;i < n;i ++){
        arr[i] = scn.nextInt();
    }
    int tar = scn.nextInt();
    int result = BinarySearch(arr,n,tar);
    if(result != -1){
        System.out.println("Element found at index : " + result);
    }
    else
    {
        System.out.println("Element not found.");
    }
}
   public static int BinarySearch(int arr[],int n,int tar){
       int left = 0,right = n-1;
       
       while(left <= right)
       {
           int mid = left + (right - left)/2;
           if(arr[mid] == tar){
               return mid;
           }
           else if(arr[mid] < tar) 
           {
               left = mid ++;
           }
           else{
               right = mid --;
           }
       }
       return -1;
}
}
