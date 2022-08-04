package leetcode.blind75.Arrays;
/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
 * 
 */
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] s2 = s.toCharArray();
            char[]t2 = t.toCharArray();
            Arrays.sort(s2);
            Arrays.sort(t2);
            for (int i = 0; i < s2.length; i++){
                if (s2[i] != t2[i]){
                    return false;
                }
            }
        }
        else{
            
            return false;
        }
        return true;
    }
}