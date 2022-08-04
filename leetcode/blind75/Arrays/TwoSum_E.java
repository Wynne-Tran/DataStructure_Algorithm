package leetcode.blind75.Arrays;

/*
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int findSolution = 0;
        int [] result = new int [2];
        
        for(int x =0; x < nums.length - 1; x++){
            findSolution = target - nums[x];
            for(int y = x+ 1; y < nums.length; y++){
                    if(nums[y] == findSolution){
                        result[0] = x;
                        result[1] = y;
                        return result;
                    }
                }
            }
        return result;
    }
   
}
