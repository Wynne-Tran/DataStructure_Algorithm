package leetcode.blind75.StringManipulation;

/*
 * Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
 */


 /* Online Java Compiler and Editor */
import java.util.*;
public class Solution{
     
     public static boolean backspaceCompare(String s, String t) {
        if ((checkString(s)).equals(checkString(t)))
            return true;
        else return false;
    }
    
    public static Stack<Character> checkString(String s) {
        Stack<Character> st1 = new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) != '#') { 
                st1.push(s.charAt(i));
            }
            else {
                if(st1.size() > 0) st1.pop();
            }
        }
        return st1;
    }

}