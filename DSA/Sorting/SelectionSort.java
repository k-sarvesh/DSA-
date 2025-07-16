import java.util.*;
import java.util.Scanner.*;
public class SelectionSort{
 public static void main(String[] args){
        int[] arr={8,73,4,9,45,63};
        selection(arr);
        System.out.println("Sorted array is "+Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i = 0 ; i<arr.length - 1;i++){
            int last = arr.length - i -1;
            int max = maxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int maxIndex(int[] arr, int start , int last){
       
            int max = start;
            for(int j = start; j< last ; j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
        return max ;
    }
    static void swap(int[] arr, int max , int last){
        int temp = arr[max] ;
        arr[max]= arr[last];
       arr[last] = temp;
    }
}
