package leetcode.blind75.StringManipulation;
import java.util.*;

/*
 * Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

class Solution {
    public boolean isPalindrome(String s) {
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int i = 0;
    int j = s.length() - 1;
    while (i < j)
      if (s.charAt(i++) != s.charAt(j--)){
          return false;
      }
    return true;
    }
}