// Input: s = "aabca"
// Output: 3
// Explanation: The 3 palindromic subsequences of length 3 are:
// - "aba" (subsequence of "aabca")
// - "aaa" (subsequence of "aabca")
// - "aca" (subsequence of "aabca")

package leetcode.blind75.Arrays;
import java.util.*;
public class UniqueLength_3PalindromicSub {

    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(countPalindromicSubsequence(s));
    }


    public static int countPalindromicSubsequence(String s) {
        int first[] = new int [26];
        int last[] = new int [26];
        int res = 0;
        Arrays.fill(first, Integer.MAX_VALUE);
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            first[temp] = Math.min(first[temp], i);
            last[temp] = i;
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(last));
        for (int i = 0; i < 26; i++) {
            if(first[i] < last[i]) {
                res += s.substring(first[i] + 1, last[i]).chars().distinct().count();
            }
        }
        return res;
    }
}
