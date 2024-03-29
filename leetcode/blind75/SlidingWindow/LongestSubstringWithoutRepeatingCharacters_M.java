package leetcode.blind75.SlidingWindow;

/*
 * 
 * Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

 */

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
            int i = 0, j = 0, max = 0;
            Set<Character> set = new HashSet<>();
    
    while (j < s.length()) {
        if (!set.contains(s.charAt(j))) {
            set.add(s.charAt(j++));
            max = max > set.size() ? max : set.size();
        } else {
            set.remove(s.charAt(i++));
        }
    }
    
    return max;
    }
}