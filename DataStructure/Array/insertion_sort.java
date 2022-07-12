package DataStructure.Array;

import java.util.*;
public class insertion_sort{

     public static void main(String []args){
         int [] arr = {4, 9, 2, 4, 7, 6, 3, 3, 0, 5};
         insertionSort(arr);
        System.out.println(Arrays.toString(arr));
     }
     
     public static void insertionSort(int [] arr){
         for(int i = 1; i < arr.length; i++){
            int elements = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > elements){
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = elements;
         }
     }
}