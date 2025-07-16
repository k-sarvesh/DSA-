import java.util.*;

public class linearsearch{
    public static void main(String[] args){
        int[] arr = {3,5,1,8,7,34,9,13};
        System.out.println(Search(arr,0,5));
    }
    static int Search(int[] arr, int index , int target){
        if(index == arr.length -1 ){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return Search(arr,index+1,target);
       
        }
    }
}