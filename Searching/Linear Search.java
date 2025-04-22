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
    int result = search(arr,n,tar);
    if(result != -1){
        System.out.println("Element found at index : " + result);
    }
    else
    {
        System.out.println("Element not found.");
    }
}
   public static int search(int arr[],int n,int tar){
       for(int i = 0;i < n;i ++){
       if(arr[i] == tar){
           return i;
       }
   }
   return -1;
}
}
