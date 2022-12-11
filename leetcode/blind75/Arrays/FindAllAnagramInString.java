
// 438. Find All Anagrams in a String

// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".


package leetcode.blind75.Arrays;
import java.util.*;
public class FindAllAnagramInString {
    public static void main(String[] args) {
        System.out.print(findAnagrams("cbaebabacd", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        if (s == null || p == null || s.length() < p.length()) {return rst;}
        int[] hash = new int[128];
        char[] t = s.toCharArray(), q = p.toCharArray();
        for (char c : q) {
            hash[c]++;
        }
        
        int start = 0, end = 0, count = p.length(), lenS = s.length(), lenP = p.length();
        while (end < lenS) {
            if (hash[t[end]] >= 1) {count--;}
            hash[t[end]]--;
            end++;
            if (count == 0) {rst.add(start);}
            if (end - start == lenP) {
                if (hash[t[start]] >= 0) {count++;}
                hash[t[start]]++;
                start++;
            }
        }
        return rst;
    }
}
