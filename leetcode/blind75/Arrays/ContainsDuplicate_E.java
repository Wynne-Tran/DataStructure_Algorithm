package leetcode.blind75.Arrays;
import java.util.*;

public class ContainsDuplicate_E {
    public static void main(String []args){
        int [] arr = {4, 9, 2, 4, 7, 6, 3, 3, 0, 5};
       System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int num : nums) {
            if (numbers.contains(num)) return true;
            numbers.add(num);
        }
        return false;
    }
}
