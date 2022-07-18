package DataStructure.Array;

import java.util.*;
public class binarySearch {
    public static void main(String []args){
    int [] arr = {4, 9, 9, 4, 7, 6, 3, 3, 0, 5};
    int answer = binary_Search_Recursion(arr, 0, arr.length - 1, 3);
    int ans = binary_Search(arr, 0, arr.length - 1, 3);

    System.out.println(answer);
    System.out.println(ans);
    }


    public static int binary_Search_Recursion(int arr[],int low, int high, int key){
        Arrays.sort(arr);
        if(low <= high){
            int mid = low + (high - low) /2 ;
            if (arr[mid] == key) return mid;
            if (arr[mid] > key){
                return binary_Search_Recursion(arr, low, mid - 1, key);
            }
            return binary_Search_Recursion(arr, mid + 1, high, key);
        }
        return -1;
    }

    public static int binary_Search(int arr[],int low, int high, int key){
        Arrays.sort(arr);
        while(low <= high){
            int mid = low + (high - low) /2 ;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key){
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return -1;
    }

}
