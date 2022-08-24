package hackerrank.StringManipulation;

import java.util.*;
public class SherlockandtheValidString_M {
    public static void main(String[] args) {
        String test = "ebhcgicceggecgdci";
        
        System.out.print(isValid(test));
    }
    
    public static String isValid(String s) {
        HashMap<Character, Integer> set = new HashMap<>();
        int distinctCount = 0;
        for(char c: s.toCharArray()){
            if(set.containsKey(c)) {
                set.put(c, set.get(c) + 1);
            }
            else {
                set.put(c, 1);
            }
        }
        int firstValue = set.get(set.keySet().toArray()[0]);
        for(char c: set.keySet()) {
            if(set.get(c) != firstValue) {
                distinctCount++;
                if (distinctCount > 1) return "NO";
            }
        }
        return "YES";
    }
}
