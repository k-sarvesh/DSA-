import java.util.*;
import java.util.Scanner.*;

public class BubbleSort{
    static void sort(int[] arr){
        for(int i = 0;i<arr.length -1;i++){
            boolean swapped=false;
            for(int j=0; j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        
    }
    public static void main(String[] args){
        int[] arr={8,73,4,9,45,63};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array is "+Arrays.toString(arr));
    }
}