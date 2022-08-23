package leetcode.blind75.StringManipulation;

/*
 * Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
import java.util.*;
class Solution {
    public static void main(String[] args) {
        String s = "ppwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
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
