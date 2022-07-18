package DataStructure.Array;

import java.util.*;
public class bubble_sort {
    public static void main(String []args){
    int [] arr = {4, 9, 2, 4, 7, 6, 3, 3, 0, 5};
    bubleSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    public static void bubleSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
