//28. Find the Index of the First Occurrence in a String


// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

package leetcode.blind75.Arrays;
public class FindTheFirstIndexMatch {
    public int strStr(String haystack, String needle) {
        //   for (int i = 0; ; i++) {
        //     for (int j = 0; ; j++) {
        //       if (j == needle.length()) return i;
        //       if (i + j == haystack.length()) return -1;
        //       if (needle.charAt(j) != haystack.charAt(i + j)) break;
        //     }
        //   }
    return haystack.indexOf(needle);
}
}
