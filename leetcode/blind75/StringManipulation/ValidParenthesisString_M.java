package leetcode.blind75.StringManipulation;

/*
 * The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

Input: s = "()"
Output: true
 */
import java.util.*;

class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(') {
                leftMin++;
                leftMax++;
            }
            else if (ch == ')') {
                leftMin--;
                leftMax--;
            }
            else {
                leftMin--;
                leftMax++;
            }
            if (leftMax < 0) {
                return false;
            }
            if (leftMin < 0) {
                leftMin = 0;
            }
        }
        return leftMin == 0;
    }
}