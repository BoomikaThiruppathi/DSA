import java.io.*;
import java.util.*;

public class Solution {
    public static int log(int n,int x){
        if(x == 0){
            return 1;
        }

        int subans = log(n, x/2);
        int ans = subans * subans;
        if(x % 2 != 0){
            ans = ans * n;
        }
        return ans;
    }

    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        System.out.println(log(n,x));
    }
}
