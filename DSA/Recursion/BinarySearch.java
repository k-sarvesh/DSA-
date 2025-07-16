

public class BinarySearch{
    public static void main(String[] args){
        int target = 6;
        int[] arr = {1,3,5,6,8,9,12,45};
        System.out.println(Search(arr,target,0,arr.length-1));
    }
    static int Search(int[] arr , int target , int start , int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return Search(arr,target,start,mid-1);
        }
        return Search(arr,target,mid+1,end);
    }
}