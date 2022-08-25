package leetcode.blind75.StringManipulation;

/*
 * Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

 */
import java.util.*;
class Solution {
    public String firstPalindrome(String[] words) {
    for (final String word : words)
      if (isPalindrome(word))
        return word;
    return "";
  }

  private boolean isPalindrome(final String s) {
    int i = 0;
    int j = s.length() - 1;
    while (i < j)
      if (s.charAt(i++) != s.charAt(j--))
        return false;
    return true;
  }
}