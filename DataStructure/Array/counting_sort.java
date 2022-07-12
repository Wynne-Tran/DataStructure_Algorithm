package DataStructure.Array;

import java.util.*;
public class counting_sort{

     public static void main(String []args){
         int [] arr = {4, 9, 2, 4, 7, 6, 3, 3, 0, 5};
         countSort(arr);
        System.out.println();
     }
     
     public static void countSort(int [] arr){
         int max = Arrays.stream(arr).max().getAsInt();
         int [] count = new int [max + 1];
         int [] output = new int [arr.length];
         
         for (int i = 0; i < arr.length; i++){
             count[arr[i]]++;
         }
        System.out.println(Arrays.toString(count));
        
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        System.out.println(Arrays.toString(count));
        
        for (int i = 0; i < arr.length; i++){
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]] --;
        }
        System.out.println(Arrays.toString(output));
     }
}
