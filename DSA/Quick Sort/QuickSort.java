import java.util.*;
import java.io.*;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {6,9,2,3,5,4,8,7,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int hi){
        if(low >= hi){
            return ;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = arr[m];

        while(s <= e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low,e);
        sort(arr,s,hi);
    }
}