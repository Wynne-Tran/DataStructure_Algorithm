package leetcode.blind75.Arrays;

/*
 * 
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */
import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int temp = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] - nums[i] == 1){
                count++;
            }
            else if (nums[i + 1] - nums[i] > 1){
                temp = Math.max(count, temp);
                count=1;
            }
        }
        return Math.max(count, temp);
    }
}
