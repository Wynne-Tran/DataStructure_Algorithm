package leetcode.blind75.Arrays;

/*
 * 
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> res = new ArrayList<>();

        for(String str: strs){
            res.add(checkString2(str));
        }
        
        for (int i=0; i<res.size(); i++){
            String temp = "null";
            List<String> tempArray = new ArrayList<>();
            
            if (res.get(i) == temp) {
                continue;
            }
            else{
                temp = res.get(i);
                tempArray.add(strs[i]);
            }
            for(int j = i+1; j < res.size(); j++){
                if((res.get(j)).equals(res.get(i))){
                    tempArray.add(strs[j]);
                    res.set(j, "null");
                }
            }
            ans.add(tempArray);
        }
        ans.sort(Comparator.comparing(List<String>::size));
        return ans;
    }
    
    public static String checkString2(String s){
        char [] arrayS = s.toCharArray();
        Arrays.sort(arrayS);
        return String.valueOf(arrayS);
    }
}