package leetcode.blind75.Arrays;

//1963. Minimum Number of Swaps to Make the String Balanced

// Input: s = "]]][[["
// Output: 2
// Explanation: You can do the following to make the string balanced:
// - Swap index 0 with index 4. s = "[]][][".
// - Swap index 1 with index 5. s = "[[][]]".
// The resulting string is "[[][]]".


// Explain a result :
// It's because when you swap two brackets it would align two pairs into valid sequence hence four brackets at right place , look at step one in example given above. let say you got 6 pairs then you will have to swap 3 times but what about 5 pairs first two swaps will align 4 pairs, but you will need one more swap to align the 5th one .
public class MinimunNumberSwapToMakeStringBalance {
    public static void main(String[] args) {
        String s = "]]][[[";
        System.out.println(minSwaps(s));
    }
    
    public static int minSwaps(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                res ++;
            } else {
                if ( res > 0) {
                    res --;
                }
            }
        }
        return (res + 1) / 2;
    }
}
