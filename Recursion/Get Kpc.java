import java.io.*;
import java.util.*;

public class Solution {
    public static String words[] = {".;","abc","def","hij","klm","mno","pqrs","tu","vwx","yz"};
    public static List<String> getKpc(String str){
              if(str.length() == 0){
                  List<String> base = new ArrayList<>();
                  base.add("");
                  return base;
              }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        List<String> subAns = getKpc(ros);
        
        int index = ch - '0';
        String word = words[index];
        
        List<String> ans = new ArrayList<>();
        
        for(int i = 0;i < word.length();i ++){
          char c = word.charAt(i);
            for(int j = 0;j < subAns.size();j ++){
                ans.add(c + subAns.get(j));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(getKpc(str));
       
    
    }
}
