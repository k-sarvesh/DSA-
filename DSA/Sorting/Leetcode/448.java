// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// Find All Numbers Disappeared in an Array
import java.util.ArrayList;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> nums = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=j+1){
                nums.add(j+1);
            }
        }
        return nums;
        
    }
    static void swap(int[] arr,int a ,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}