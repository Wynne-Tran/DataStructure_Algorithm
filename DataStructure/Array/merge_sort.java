package DataStructure.Array;

import java.util.*;

//Divide and conquer algorithm
public class merge_sort {
    public static void main(String []args){
        int [] arr = {4, 9, 2, 4, 7, 6, 3, 3, 0, 5};
       merge_sort.sort(arr, 0, arr.length - 1);
       System.out.println(Arrays.toString(arr));
    }


    public static void merge(int arr[], int low, int mid, int high){
        // 1. find size 2 subarray
        int size1 = mid - low + 1;
        int size2 = high - mid;

        // 2. create temp array
        int [] left = new int [size1];
        int [] right = new int [size2];

        // 3.Copy data into temp array
        for(int i = 0; i < size1; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < size2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        //4. merge 2 subarrays
        int i = 0, j = 0, k = low;
        while (i < size1 && j < size2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        // 5. copy the rest item to arr
        while ( i < size1) {arr[k] = left[i]; i++; k++;}
        while ( j < size2) {arr[k] = right[j]; j++; k++;}
    }

    public static void sort(int arr[], int left, int right) {
        if ( left < right) {
            int mid = left + (right - left)/2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

}
