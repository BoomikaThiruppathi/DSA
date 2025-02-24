import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isBalanced(String str)
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i < str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                st.push(ch);
            }
            else if(ch == ')' ||ch == '}' || ch == ']')
            {
                if(st.size() == 0)
                {
                    return false;
                }
                if(ch == ')' && st.peek() == '(')
                {
                    st.pop();    
                }
                else if(ch == '}' && st.peek() == '{')
                {
                    st.pop();    
                }
                else if(ch == ']' && st.peek() == '[')
                {
                    st.pop();    
                }
                
            
            else
            {
                return false;
            }
            
        }
        }
            if(st.size() == 0)
            {
                return true;
            }
            
        return false;
    }

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(isBalanced(str));
        
    }
}
