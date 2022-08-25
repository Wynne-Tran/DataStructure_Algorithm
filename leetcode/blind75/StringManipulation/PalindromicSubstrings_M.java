package leetcode.blind75.StringManipulation;
/*
 * Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 */


class Solution {
    public int countSubstrings(String s) {
        if(s.length() < 2) return s.length();
        int res = 0;
        for(int i = 0; i < s. length(); i ++) {
            int s1 = palindrome(s, i, i );
            int s2 = palindrome(s, i , i+1);
            res += s1 + s2;
        }
        return res;
        
    }
    
    public static  int palindrome(String s, int l, int r) {
        int res = 0;
    while (l >= 0 && r < s.length()
            && s.charAt(l) == s.charAt(r)) {
        res++;
        l--; r++;
      
    }
    return res;
    }
}