import java.io.*;
import java.util.*;

public class Solution {
public static int power(int x,int n){
    if(n == 0){
        return 1;
    }
    return power(x, n -1 ) * x;
    
    
}
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(power(x,n));
    }
}
