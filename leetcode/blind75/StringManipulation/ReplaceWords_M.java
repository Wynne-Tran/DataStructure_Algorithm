package leetcode.blind75.StringManipulation;

/*
 * Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
    Output: "the cat was rat by the bat"
 */

import java.util.*;
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set = new HashSet<>();
        for(String word: dictionary) {set.add(word);}
        String[] newArray = sentence.split(" ");
        String res = "";
        for(String s : newArray){
            String curr = "";
            for(int i = 0; i <= s.length(); i++){
                curr = s.substring(0, i);
                if(set.contains(curr)) {
                    //curr = curr + "*".repeat(s.length() - curr.length());
                    break;}
            }
            res += curr + " ";
        }
        return res.substring(0, res.length() - 1);
    }
}