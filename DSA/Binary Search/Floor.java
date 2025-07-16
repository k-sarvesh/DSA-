import java.util.*;
import java.util.Scanner.*;

class Search{
     int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
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
        return end;
    }
}

public class Floor{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i< size ; i++){
            System.out.println("Enter the "+i+" element of the array ");
            arr[i]=sc.nextInt();
        }
        Search s = new Search();
        System.out.println("Enter the target value that you want to find:");
        int target = sc.nextInt();
      
        System.out.println("Floor of that number is at "+  s.search(arr,target));

    }
}
