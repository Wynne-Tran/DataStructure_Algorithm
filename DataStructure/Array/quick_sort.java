package DataStructure.Array;

import java.util.*;
public class quick_sort {
    public static void main(String []args){
        int [] arr = {4, 9, 2, 4, 7, 6, 3, 3, 0, 5};
        quickSort(arr, 0, arr.length -1);
       System.out.println(Arrays.toString(arr));
    }
    
    public static void quickSort(int [] arr, int low, int high){
        if(low < high){
            int partition = partition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    public static void swap(int [] arr, int i, int cdj){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition( int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j <= high - 1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i + 1;
    }
}
