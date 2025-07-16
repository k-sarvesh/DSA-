import java.util.*;
import java.util.Scanner.*;

class Search{
    public int search(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            int temp = end + 1 ;
            end = end + ((end - start)+1)*2;
            start = temp;
        }
        return BinarySearch(arr,target,start,end);
    }
     int BinarySearch(int[] arr,int target,int start , int end ){
        while(end >= start){ 
        int middle = start + (end - start)/2;
        if(arr[middle]==target){
            System.out.println("Found");
            return middle;
        }
        else{
        if(target > arr[middle]){
            start = middle+1;
        }
        else{
            end = middle-1 ;
        }
        }
         }
        System.out.println("Not found");
        return -1;
    }
    
}

public class Infinitearray{
    public static void main(String [] args ){
          Scanner sc = new Scanner(System.in);
        
        int[] arr = {3,5,7,9,10,90,100,150,190,220};
        Search s = new Search();
        System.out.println("Enter the target value that you want to find:");
        int target = sc.nextInt();
      
        System.out.println("Target is at "+  s.search(arr,target));

    }
       
}

