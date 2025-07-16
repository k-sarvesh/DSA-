// https://leetcode.com/problems/find-the-duplicate-number/
//  Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                if(i!=correct)
                return arr[i];
                i++;
            }
        }
     
        return -1;
    }
    static void swap(int[] arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}