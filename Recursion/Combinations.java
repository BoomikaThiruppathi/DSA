import java.io.*;
import java.util.*;

public class Solution {
    public static void combinations(int cbox,int nboxes,int citem,int items,String ans){
        if(cbox > nboxes){
            if(citem == items){
                System.out.println(ans);
            }
            return;
        }
        
        combinations(cbox +1, nboxes, citem + 1, items, ans + "i");
        combinations(cbox +1, nboxes, citem, items, ans + "-");
    }

    public static void main(String[] args) {
    
       Scanner scn = new Scanner(System.in);
        int nboxes = scn.nextInt();
        int items = scn.nextInt();
        combinations(1,nboxes,0,items,"");
    
    }
}
