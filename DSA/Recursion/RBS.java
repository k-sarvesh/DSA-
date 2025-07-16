import java.util.*;

public class RBS{
    public static void main(String[] args){
        int[] arr = {6,7,9,1,3,5};
        System.out.println(search(arr,5,0,arr.length -1));
        
    }
    static int search(int[] arr, int target , int s , int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>=arr[s] && arr[m]>=target){
                return search(arr,target,s,m-1);
            }
            else{
                return search(arr,target,m+1,e);
            }
        }
        if(target>=arr[m] && arr[e] >= target){
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);

    }
}