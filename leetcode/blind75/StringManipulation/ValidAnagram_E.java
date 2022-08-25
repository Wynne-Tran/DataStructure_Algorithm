package leetcode.blind75.StringManipulation;
import java.util.*;
/*
 * Input: s = "anagram", t = "nagaram"
Output: true
 */


import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)) return true;
        if(s.length() != t.length()) return false;
        if(Arrays.equals(checkString(s), checkString(t))) return true;
        return false;
    }
    
    public static char[] checkString(String s){
        char [] arrayS = s.toCharArray();
        Arrays.sort(arrayS);
        return arrayS;
    }
}
