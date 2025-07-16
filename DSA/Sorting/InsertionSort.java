import java.util.*;
import java.util.Scanner.*;
public class InsertionSort{
 public static void main(String[] args){
        int[] arr={8,73,4,9,45,63};
        Insertion(arr);
        System.out.println("Sorted array is "+Arrays.toString(arr));
    }
    static void Insertion(int[] arr){
        for(int i = 0 ; i<arr.length - 1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]>arr[j+1]){
                    swap(arr,j ,j+1);
                }
                else{
                    break;
                }
            }
    }
    static void swap(int[] arr, int max , int last){
        int temp = arr[max] ;
        arr[max]= arr[last];
       arr[last] = temp;
    }
}
