package DataStructure.Array;

import java.util.*;
public class selection_sort {
    public static void main(String []args){
        int [] arr = {4, 9, 2, 4, 7, 6, 3, 3, 0, 5};
        selectionSort(arr);
       System.out.println(Arrays.toString(arr));
    }
    
    public static void selectionSort(int [] arr){
        for(int start = 0; start < arr.length; start++){
           int smallestLoc = start;
           for (int post = start + 1; post < arr.length; post++){
                if(arr[post] < arr[smallestLoc]){
                    int temp = arr[post];
                    arr[post] = arr[smallestLoc];
                    arr[smallestLoc] = temp;
                }
           }
        }
    }
}
